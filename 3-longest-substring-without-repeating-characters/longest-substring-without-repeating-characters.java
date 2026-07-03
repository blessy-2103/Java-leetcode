class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        char[] ch = s.toCharArray();
        for(int i = 0;i<s.length();i++){
            HashSet<Character> set = new HashSet<>();
            for(int j = i;j<s.length();j++){
                if(set.contains(ch[j])){
                    break;
                }
                set.add(ch[j]);

            }
            max = Math.max(max,set.size());
        }
        return max;
    }
}