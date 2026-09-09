class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> list = new ArrayList<>();
    
        for(int i  = 0;i<words.length;i++){
            String s = words[i];
            for(char ch : s.toCharArray()){
                if(ch == x){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}