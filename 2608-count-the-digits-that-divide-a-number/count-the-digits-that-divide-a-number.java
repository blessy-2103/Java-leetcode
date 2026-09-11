class Solution {
    public int countDigits(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = num;
        int count = 0;
        while(num != 0){
            int r = num % 10;
            if(n % r == 0){
                count++;
            }
            num /= 10;
        }
        
        return count;
    }
}