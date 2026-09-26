class Solution {
    public int absDifference(int[] nums, int k) { 
     ArrayList<Integer> list = new ArrayList<>();
     for(int i : nums){
        list.add(i);
     }
     Collections.sort(list);
     int large = 0;
     for(int i = list.size()-1; i > list.size() - 1 - k;i--){
        large += list.get(i);
     }
     int small = 0;
     for(int i = 0;i<k;i++){
        small += list.get(i);
     }
     int c = large - small;
     int d = Math.abs(c);
     return d;
    }
}