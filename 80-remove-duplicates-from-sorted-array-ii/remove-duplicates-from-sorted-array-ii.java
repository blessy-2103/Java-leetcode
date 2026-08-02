class Solution {
    public int removeDuplicates(int[] nums) {
       HashSet<Integer> set= new HashSet<>();
       for(int j : nums){
        set.add(j);
       }
       int[] arr =new int[set.size()];
       int ind = 0;
       for(int k : set){
        arr[ind++] = k;
       }
       ArrayList<Integer> list = new ArrayList<>();
       for(int i = 0;i<arr.length;i++){
        int count = 0;
        for(int j = 0;j<nums.length;j++) {
            if(arr[i] == nums[j]){
                count++;
            }
        }
        if(count>=2){
            list.add(arr[i]);
            list.add(arr[i]);
        }
        if(count == 1){
            list.add(arr[i]);
        }
       }
     Collections.sort(list);
     for(int i = 0;i<list.size();i++){
        nums[i] = list.get(i);
     }
     return list.size();
    }
}