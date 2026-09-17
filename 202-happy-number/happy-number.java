class Solution {
    public boolean isHappy(int n) {
        while(n>5){
            int sum = 0;
            while(n!=0){
                int r = n%10;
                sum += Math.pow(r,2);
                n /= 10;
            }
            n = sum;
        }
        if(n ==1){
            return true;
        }
        return false;
    }
}