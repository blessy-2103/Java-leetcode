class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(temp);
        HashMap<Integer,Integer> map = new HashMap<>();
        int Rank = 1;
        for(int i : temp){
            if(!map.containsKey(i)){
                map.put(i,Rank++);
            }
        }
        for(int i = 0;i<arr.length;i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}