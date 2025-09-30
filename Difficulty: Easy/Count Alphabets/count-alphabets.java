// User function Template for Java

class Solution {
    static int Count(String S) {
        // code here
        String s = S.toLowerCase();
        HashSet<Character> hs = new HashSet(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
));
        int cnt = 0;
        for(int i=0;i<s.length();i++){
            if(hs.contains(s.charAt(i)))
                cnt++;
        }
        return cnt;
    }
}