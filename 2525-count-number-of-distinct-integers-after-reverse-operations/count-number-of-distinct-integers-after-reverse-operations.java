class Solution {
    public int countDistinctIntegers(int[] nums) {
       ArrayList<Integer> list = new ArrayList<>();
       for(int i : nums){
        list.add(i);
       }
       for(int n : nums){
        int sum = 0;
        while(n!=0){
            int r = n%10;
            sum =sum * 10 + r;
            n/=10;
        }
        list.add(sum);
       }
       HashSet<Integer> set = new HashSet<>();
       for(int i : list){
        set.add(i);
       }
       return set.size();
    }
}