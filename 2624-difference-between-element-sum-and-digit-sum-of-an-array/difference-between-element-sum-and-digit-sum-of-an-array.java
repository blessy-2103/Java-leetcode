class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        for(int n : nums){
            sum += n;
        }
        int s = 0;
        for(int i : nums){
          while(i!=0){
            int r = i%10;
            s += r;
            i /= 10;
          }
        }
        int a = Math.abs(sum - s);
        return a;
    }
}