class Solution {
    public boolean validDigit(int n, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        while(n!=0){
            int r = n %10;
            list.add(r);
            n /= 10;
        }
        Collections.reverse(list);
        if(!list.contains(x)){
            return false;
        }
        if(list.get(0)==x){
            return false;
        }
        return true;
    }
}