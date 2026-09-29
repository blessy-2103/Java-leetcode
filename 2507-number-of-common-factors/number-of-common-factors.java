class Solution {
    public int commonFactors(int a, int b) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1;i<=a;i++){
            if(a%i == 0){
                list.add(i);
            }
        }
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 1;i<=b;i++){
            if(b%i == 0){
                l.add(i);
            }
        }
       ArrayList<Integer> ans = new ArrayList<>();
       int count = 0;
       for(int i : list){
        
        if(l.contains(i)){
            count++;
            ans.add(i);
        }
       } 
       return count;
    }
}