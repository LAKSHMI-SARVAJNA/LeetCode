class Solution {
    public int hammingWeight(int n) {
        int c = 0;
        String b = "";
        while(n > 0) {
            int r = n%2;
             b = b+r;
            n = n/2;
        }
               
            for(int i = 0; i < b.length(); i++) {
                if(b.charAt(i) == '1') {
                    c++;
                }
            }
        return c;
    }
}