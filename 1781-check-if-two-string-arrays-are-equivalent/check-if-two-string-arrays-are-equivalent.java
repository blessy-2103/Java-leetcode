class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
     
        String a = "";
        for(String w : word1){
            a+=w;
        }
        String b = "";
        for(String c : word2){
            b+=c;
        }
        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();
        
        return Arrays.equals(c1,c2);
    }
}