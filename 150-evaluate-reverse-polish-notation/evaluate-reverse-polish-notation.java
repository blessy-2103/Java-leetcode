class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(String ch : tokens){
            if(ch.equals("+")){
                int a = s.pop();
                int b = s.pop();
                
                s.push(a+b);
            }
           else if(ch.equals("*")){
                int c = s.pop();
                int d = s.pop();
                
                s.push(c*d);
            }
           else if(ch.equals("/")){
                int e = s.pop();
                int f = s.pop();
                
                s.push(f/e);
            }
            else if(ch.equals("-")){
                int g = s.pop();
                int h = s.pop();
                s.push(h-g);
            }
            else{
                s.push(Integer.parseInt(ch));
            }
        }
        int sum = 0;
        for(int i : s){
            sum+=i;
        }
        return sum;
    }
}