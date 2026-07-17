class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        int[] a = new int[arr.length];
        String[] f = new String[arr.length];
        String[] ans = new String[arr.length];
        int ind = 0;
        for(String word : arr){
            for(char ch : word.toCharArray()){
                if(Character.isDigit(ch)){
                    a[ind++] = ch-'1';
                }
            }
        }
        int k = 0;
        for(String w : arr){
            String res = "";
            for(char ch : w.toCharArray()){
                if(Character.isLetter(ch)){
                      res+=ch;
                }
            }
            ans[k++] = res;
        }
        for(int i = 0;i<arr.length;i++){
            f[a[i]] = ans[i];
        }
        String h = "";
        for(int i = 0;i<f.length;i++){
            h+=f[i];
            if(i<f.length-1){
            h+=" ";
            }
        }
        return h;
    }
}