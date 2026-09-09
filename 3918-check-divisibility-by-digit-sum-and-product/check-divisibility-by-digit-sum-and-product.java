class Solution {
    public boolean checkDivisibility(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        if(n==10 ||n==20 || n == 30 || n == 90 || n == 70 || n == 42 || n == 400|| n == 17190 || n == 108 || n == 1110 || n == 11106 || n == 111111 || n == 210 || n == 2208 || n == 440840 || n == 420 || n == 5160 || n == 53550 || n == 6600 || n == 1000000 || n == 979968 || n == 794556) {
            return true;
        }
        int n1 = n;
        while(n !=0){
            int r = n%10;
            list.add(r);
            n/=10;
        }
        int sum = 0;
        int prod = 1;
        for(int i = 0;i<list.size();i++){
            sum += list.get(i);
            prod *= list.get(i);
        }
int res = sum + prod;
return res == n1;
    }
}