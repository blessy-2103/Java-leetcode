class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       
        Arrays.sort(letters);
        int t = target;
        for(int i =0;i<letters.length;i++){
            int a = letters[i];
            if(a>t){
                return letters[i];
            }
        }
        return letters[0];
    }
}