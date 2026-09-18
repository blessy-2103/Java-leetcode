class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        for(int n : nums){
            while(n!=0){
                int r = n%10;
                if(r== digit){
                    count++;
                }
                n /= 10;
            }
        }
        return count;
    }
}