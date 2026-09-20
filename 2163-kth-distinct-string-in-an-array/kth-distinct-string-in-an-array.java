class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        for(String i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<String> list = new ArrayList<>();
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                list.add(entry.getKey());
            }
        }
         if (k <= 0 || k > list.size()) {
            return "";
        }
       return list.get(k-1);
    }
}