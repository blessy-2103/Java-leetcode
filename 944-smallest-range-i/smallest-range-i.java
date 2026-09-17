class Solution {
    public int smallestRangeI(int[] nums, int k) {
         int min = nums[0];
        int max = nums[0];
        
     
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
    
        int dynamicGap = (max - k) - (min + k);

        return Math.max(0, dynamicGap);
    }
}