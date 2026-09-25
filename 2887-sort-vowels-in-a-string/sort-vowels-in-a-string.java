class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch =='O' || ch == 'U' ) {
                list.add(ch);
            }
        }
        Collections.sort(list);
        int ind = 0;
        String res = "";
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                res += list.get(ind++);
            }
            else{
                res += c;
            }
        }
        return res;
    }
}