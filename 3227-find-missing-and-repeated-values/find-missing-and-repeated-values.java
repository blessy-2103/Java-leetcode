class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                list.add(grid[i][j]);
            }
        }
        int[] arr = new int[2];
        HashMap<Integer,Integer> map  = new HashMap<>();
        for(int i : list){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int res = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 2){
                res = entry.getKey();
            }
        }
        arr[0] = res;
        int sum = 0;
for(int n : list){
            sum += n;
        }
        int n = list.size();
        int total = (n*(n+1))/2;
        arr[1] = total - (sum -res);
        return arr;
    }
}