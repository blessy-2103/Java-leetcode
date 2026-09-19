class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                   if(entry.getValue() > max){
                    max = entry.getValue();
                   }
        }
        int sum = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == max){
                sum += entry.getValue();
            }
        }
        return sum;
    }
}