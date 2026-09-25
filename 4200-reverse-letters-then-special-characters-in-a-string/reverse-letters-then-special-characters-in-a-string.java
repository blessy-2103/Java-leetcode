class Solution {
    public String reverseByType(String s) {
        String letter = "";
         String s1 = "";
         for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                letter += ch;
            }
            else{
                s1 += ch;
            }
         }
         StringBuilder sb = new StringBuilder(letter);
         String rev = sb.reverse().toString();
         StringBuilder s2 = new StringBuilder(s1);
         String ans = s2.reverse().toString();
         int ind = 0;
         int k = 0;
         String f = "";
         for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isLetter(c)){
                f+= rev.charAt(ind++);
            }
            else{
                f += ans.charAt(k++);
            }
         }
         return f;
    }
}