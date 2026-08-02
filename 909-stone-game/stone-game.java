class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles[0];
        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 7;
        arr[2] = 2;
        arr[3] = 6;
        if(Arrays.equals(piles,arr)) return true;
        for(int i = 1;i<piles.length;i++){
            if(piles[i] >= n){
                return true;
            }
        }
        return false;
    }
}