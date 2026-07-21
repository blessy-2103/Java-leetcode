class Solution {
    public long sumAndMultiply(int n) {
        String s = "";
        while(n!=0){
            int r = n%10;
            if(r!=0){
            s+= r;
            }
            n /= 10;
        }
        if (s.length() == 0) {
            return 0;
        }
        StringBuilder sb = new StringBuilder(s);
        String res = sb.reverse().toString();
        
        long a = Long.parseLong(res);
        long b = a;

        long sum = 0;
        while(a!=0){
            long f = a%10;
            sum += f;
            a /= 10;
        }
        long ans = Math.abs(b) * Math.abs(sum);
        return ans;
    }
}