class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for(String word : words){
            boolean isequal = true;
            char[] ch = word.toCharArray();
            char[] c = allowed.toCharArray();
            ArrayList<Character> list = new ArrayList<>();
            for(char k : c){
                list.add(k);
            }
            for(int i = 0;i<ch.length;i++){
               if(!list.contains(ch[i])){
                isequal = false;
               }
            }
            if(isequal){
                count++;
            }
        }
        return count;
    }
}