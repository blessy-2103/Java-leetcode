class Solution {
    public int findChampion(int[][] grid) {
        int max = 0;
        int team = 0;
        for(int i = 0;i<grid.length;i++){
            int sum = 0;
            for(int j = 0;j<grid[i].length;j++){
                sum += grid[i][j];
            }
            if(sum>max){
                max = sum;
                team = i;
            }
        }
        return team;
    }
}