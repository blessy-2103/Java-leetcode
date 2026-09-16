class Solution {
    public int countSpecialIntegers(int[] nums) {
        int c = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            int count = 0;
            ArrayList<Integer> list = new ArrayList<>();
            int a = nums[i];
            for(int j = 0;j<nums.length;j++){
                if(a == nums[j] && !set.contains(a)){
                    count++;
                    list.add(j);
                }
            }
            set.add(a);
            Collections.sort(list);
            if(count == 3){
             if(list.get(1) - list.get(0) == list.get(2) - list.get(1)){
                c++;
             }

            }
        }
        return c;
    }
}