class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
         int midValue = nums[nums.length / 2];
        int count = 0;
        for (int num : nums) {
            if (num == midValue) {
                count++;
            }
        }
        return count == 1;
    }
}