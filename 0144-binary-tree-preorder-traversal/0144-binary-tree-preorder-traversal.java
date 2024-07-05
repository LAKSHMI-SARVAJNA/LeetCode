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
    public List<Integer> preorderTraversal(TreeNode root) {
        List <Integer> stack = new ArrayList<Integer>();
        preorder(root,stack);
        return stack;
    }
    public void preorder(TreeNode root, List<Integer> stack) {
        if(root == null) {
            return ;
        }
        stack.add(root.val);
        preorder(root.left,stack);
        preorder(root.right,stack);
    }
    
}