class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : nums){
            ArrayList<Integer> l = new ArrayList<>();
            while(n!=0){
                int r = n% 10;
                l.add(r);
                n /= 10;
            }
            Collections.reverse(l);
            for(int i : l){
                list.add(i);
            }
        }
        int[] arr = new int[list.size()];
        for(int i = 0;i<arr.length;i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}