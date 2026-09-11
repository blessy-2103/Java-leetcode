class Solution {
    public int subtractProductAndSum(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while(n!=0){
            int r = n%10;
            list.add(r);
            n /= 10;
        }
        int sum = 0;
        int prod = 1;
        for(int i : list){
            sum += i;
            prod *= i;
        }
        return prod - sum;
    }
}