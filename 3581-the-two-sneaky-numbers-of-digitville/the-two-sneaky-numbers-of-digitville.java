class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 2){
                list.add(entry.getKey());
            }
        }
        int[] arr = new int[list.size()];
        int ind = 0;
        for(int i : list){
            arr[ind++] =i;
        }
        return arr;
    }
}