class Solution {
    public int reverseDegree(String s) {
       int[] arr = {26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
       int sum =0;
       for(int i = 0;i<s.length();i++){
        int ind = i+1;
        int ch = s.charAt(i);
        int ans = ch - 'a';
        sum = ind * arr[ans] +sum;
       } 
       return sum;
    }
}