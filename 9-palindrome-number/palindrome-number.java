class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int sum = 0;
        int n = x;
        while(x!=0){
            int r = x%10;
            sum = (sum*10)+r;
            x /= 10;
        }
        boolean res = (sum == n ? true:false);
        return res;
    }
}