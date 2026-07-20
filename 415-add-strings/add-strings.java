import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
       BigInteger b = new BigInteger(num1);
       BigInteger b2 = new BigInteger(num2);
        BigInteger sum = b.add(b2);
        String res = String.valueOf(sum);
        return res;
    }
}