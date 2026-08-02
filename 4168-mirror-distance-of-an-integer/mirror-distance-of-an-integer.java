class Solution {
    public int mirrorDistance(int n) {
        int rev = 0;
        int n1 = n;
        while(n1!=0){
            int r = n1 % 10;
            rev = rev * 10 + r;
            n1 /= 10;
        }
        int res = Math.abs(rev-n);
        return res;
    }
}