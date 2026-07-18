class Solution {
    public String finalString(String s) {
        String res = "";
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='i'){
                StringBuilder sb = new StringBuilder(res);
                 res = sb.reverse().toString();
            }
            else{
                res+=ch;
            }
        }
        return res;
    }
}