class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char[] ch = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
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