class Solution {
    public int firstUniqueEven(int[] nums) {
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i :nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
             if(entry.getKey()%2==0 && entry.getValue() == 1){
                return entry.getKey();
             }
        }
        return -1;
    }
}