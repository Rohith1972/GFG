// User function Template for Java

class Solution {
    String gameResult(String s) {
        // your code here
        char ch[] = s.toCharArray();
        if(ch[0] == ch[1])
            return new String("DRAW");
        if(ch[0]=='R'&&ch[1]=='S'||ch[0]=='S'&&ch[1]=='P'||ch[0]=='P'&&ch[1]=='R')
            return new String("A");
        else
            return new String("B");
    }
}