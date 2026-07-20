class Solution {
    public String convertDateToBinary(String date) {
         int ind = 0;
        String[] arr = date.split("-");
        String[] a = new String[arr.length];
        for(String d : arr){
            int v = Integer.valueOf(d);
            String res = Integer.toBinaryString(v);
            a[ind++] = res;
        }
        String ans = "";
        for(int i = 0;i<arr.length-1;i++){
            ans += a[i];
            ans+='-';
        }
        ans+=a[arr.length-1];
        return ans;
    }
}