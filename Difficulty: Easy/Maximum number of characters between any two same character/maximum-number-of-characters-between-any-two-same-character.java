// User function Template for Java

class Solution {
    public int maxChars(String s) {
        // code here
        int max = -1;
        HashMap<Character,Integer> res = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!res.containsKey(s.charAt(i)))
                res.put(s.charAt(i),i);
            else{
                max = Math.max(max,i-res.get(s.charAt(i))-1);
            }
        }
        return max;
    }
}