import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.HashMap;

class Solution {
    public String decodeMessage(String key, String message) {
        char[] letter = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
  
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(char c : key.toCharArray()){
            if(c != ' '){
                set.add(c);
            }
        }
        
     
        HashMap<Character, Character> map = new HashMap<>();
        int index = 0;
        for(char ch : set){
            map.put(ch, letter[index]);
            index++;
        }
        
        StringBuilder decoded = new StringBuilder();
        for(char c1 : message.toCharArray()){
            if(c1 == ' '){
                decoded.append(' '); 
            } else {
                decoded.append(map.get(c1)); 
            }
        }
        
        return decoded.toString();
    }
}
