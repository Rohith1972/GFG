// User function Template for Java

class Solution {
    public boolean nonRepetitive(String S) {
        // Your code goes here
        int n = S.length();
        HashSet<Character> seen = new HashSet<>();
        for(int i=0;i<n;i++){
            char c = S.charAt(i);
            if(seen.contains(c))
                return false;
            while(i+1<n&&S.charAt(i+1)==c)
                i++;
            seen.add(c);
        }
        return true;
    }
}