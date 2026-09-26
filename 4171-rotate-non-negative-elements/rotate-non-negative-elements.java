class Solution {
    public int[] rotateElements(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums){
            if(i>=0){
                list.add(i);
            }
        }
        int size = list.size();
        if (size == 0) {
            return nums;
        }
        k = k % size;
        int[] temp = new int[size];
        for(int i = 0;i<size;i++){
            temp[i] = list.get((i+k)%size);
        }
        int ind = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>=0){
           nums[i] = temp[ind++];
            }
        }
        return nums;
    }
}