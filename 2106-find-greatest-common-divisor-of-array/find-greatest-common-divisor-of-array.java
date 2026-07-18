class Solution {
    public int findGCD(int[] nums) {
        int max = 0;
        for(int x : nums){
            if(x > max){
                max = x;
            }
        }
        int min = nums[0];
        for(int y : nums){
            if(y<min){
                min = y;
            }
        }
        while(min!=0){
          int temp = min;
          min = max%min;
          max = temp;
        }
        return max;
    }
}