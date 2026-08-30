class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int n = nums.length;
        int min = nums[0];
        int max = nums[0];
        int min_index = 0;
        int max_index = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                max_index = i;
            }
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
                min_index = i;
            }
        }
        int left = Math.min(min_index, max_index);
        int right = Math.max(min_index, max_index);
        int fromFront = right + 1;
        int fromBack = n - left;
        int fromBoth = (left + 1) + (n - right);
        return Math.min(fromFront, Math.min(fromBack, fromBoth));
          }
}