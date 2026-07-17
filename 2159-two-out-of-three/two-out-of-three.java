class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> n1 = new HashSet<>();
        HashSet<Integer> n2 = new HashSet<>();
        HashSet<Integer> n3 = new HashSet<>();
        for(int a : nums1){
            n1.add(a);
        }
        for(int b : nums2){
            n2.add(b);
        }
        for(int c : nums3){
            n3.add(c);
        }
        for(int i = 0;i<nums1.length;i++){
            if(n2.contains(nums1[i])){
                list.add(nums1[i]);
            }
        }
        for(int i = 0;i<nums2.length;i++){
            if(n3.contains(nums2[i])){
                list.add(nums2[i]);
            }
        }
        for(int i = 0;i<nums3.length;i++){
            if(n1.contains(nums3[i])){
                list.add(nums3[i]);
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i : list){
            set.add(i);
        }
        ArrayList<Integer> l = new ArrayList<>();
        for(int d : set){
            l.add(d);
        }
        return l;
    }
}