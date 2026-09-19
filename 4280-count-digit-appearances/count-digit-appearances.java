class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : nums){
            while(n!=0){
                int r = n%10;
                list.add(r);
                n /= 10;
            }
        }
        int count = 0;
        for(int i : list){
            if(i == digit){
                count++;
            }
        }
        return count;
    }
}