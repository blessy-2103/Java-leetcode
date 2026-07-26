class Solution {
    public int maximumProduct(int[] nums) {
       
        Arrays.sort(nums);
        int n = nums.length-1;
        int prod1 = nums[n] * nums[n-1] * nums[n-2];
        int prod2 = nums[0] * nums[1] * nums[n];
        int res = Math.max(prod1,prod2);
        return res;
    }
}