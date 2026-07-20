import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        String a = "";
        for(int x : num){
            a+=x;
        }
        String s  = String.valueOf(k);
        BigInteger v = new BigInteger(s);
    BigInteger b = new BigInteger(a);
    BigInteger sum = b.add(v);
    String val = String.valueOf(sum);
    char[] ch = val.toCharArray();
    ArrayList<Integer> list = new ArrayList<>();
    for(char i : ch){
        list.add((int) i - 48);
    }
    return list;
    }
}