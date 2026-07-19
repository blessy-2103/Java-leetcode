class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> s1 = new Stack<>();
        for(char ch : s.toCharArray()){
            if(s1.isEmpty()){
                s1.push(ch);
            }
            else if(s1.peek()==ch){
                s1.pop();
            }
            else{
                s1.push(ch);
            }
        }
        String res = "";
        for(char c : s1){
            res+= c;
        }
        return res;
    }
}