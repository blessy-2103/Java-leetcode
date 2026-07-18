class Solution {
    public boolean isValid(String s) {
        Stack<Character> sa = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                sa.push(')');
            }
            else if(ch == '['){
                sa.push(']');
            }
            else if(ch == '{'){
                sa.push('}');
            }
            else{
                if(sa.isEmpty() || sa.pop() != ch){
                    return false;
                }
            }
        }
        return sa.isEmpty();
    }
}