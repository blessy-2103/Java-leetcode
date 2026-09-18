class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>k){
                for(int i = 0;i<k;i++){
                    list.add(entry.getKey());
                }
            }
            else if(entry.getValue()<= k){
              for(int i = 0;i<entry.getValue();i++){
                list.add(entry.getKey());
              }
            }
        }
        Collections.sort(list);
        int[] arr= new int[list.size()];
        for(int i = 0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}