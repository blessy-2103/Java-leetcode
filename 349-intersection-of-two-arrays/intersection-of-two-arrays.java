class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        for(int i : nums1){
            set.add(i);
        }
        for(int j : nums2){
            if(set.contains(j)){
                set1.add(j);
            }
        }
        int[] arr = new int[set1.size()];
        int ind = 0;
        for(int i : set1){
        arr[ind++] = i;
        }
        return arr;
    }
}