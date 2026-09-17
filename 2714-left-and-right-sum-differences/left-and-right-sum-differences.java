class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = 0;
        right[nums.length-1] = 0;
        int sum = 0;
        int ind = 0;
        for(int i = 1;i<nums.length;i++){
            sum += nums[ind++];
            left[i] = sum;
        }
        int index = nums.length-1;
        int s = 0;
        for(int i = nums.length-2;i>=0;i--){
            s += nums[index--];
            right[i] = s;
        }
       int[] ans = new int[nums.length];
       for(int i = 0;i<nums.length;i++){
        ans[i] = Math.abs(left[i] - right[i]);
       }
       return ans;
    }
}