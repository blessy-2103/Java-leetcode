class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] s = text.split(" ");
        ArrayList<String> s1 = new ArrayList<>();
        for(int i = 2;i<s.length;i++){
            if(s[i-2].equals(first) && s[i-1].equals(second)){
                s1.add(s[i]);
            }
        }
        String[] a = new String[s1.size()];
        for(int i = 0;i<a.length;i++){
            a[i]  = s1.get(i);
        }
        return a;
    }
}