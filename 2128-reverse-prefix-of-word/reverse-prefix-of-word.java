class Solution {
    public String reversePrefix(String word, char ch) {
        String r = "";
        int ind = -1;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                ind = i;
                break;
            }
            r += word.charAt(i);
        }

        if (ind == -1) {
            return word;
        }

        r += word.charAt(ind);

        StringBuilder sb = new StringBuilder(r);
        String s = sb.reverse().toString();

        for (int i = ind + 1; i < word.length(); i++) {
            s += word.charAt(i);
        }

        return s;
    }
}