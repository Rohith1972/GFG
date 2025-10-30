// User function Template for Java

class Solution {
    String removeDups(String s) {
        // code here
        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            hs.add(ch);
        }
        StringBuffer sb = new StringBuffer();
        for(Character ch : hs){
            sb.append(ch);
        }
        return sb.toString();
    }
}