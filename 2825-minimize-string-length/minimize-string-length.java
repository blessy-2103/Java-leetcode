class Solution {
    public int minimizedStringLength(String s) {
        int count = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            count++;
        }
        return count;
    }
}