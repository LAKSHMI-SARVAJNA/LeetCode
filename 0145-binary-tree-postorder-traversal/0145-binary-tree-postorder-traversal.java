/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> stack = new ArrayList<Integer>();
        postorder(root,stack);
        return stack;
    }
    
    public void postorder(TreeNode root,List<Integer> stack) {
        if(root == null) {
            return;
        }
        postorder(root.left,stack);
        postorder(root.right,stack);
        stack.add(root.val);
        
    }
}