class Solution {
    public int lengthOfLastWord(String s) {
        String s1 = s.trim();
        String[] arr = s.split(" ");
        String a = arr[arr.length-1];
        return a.length();
    }
}