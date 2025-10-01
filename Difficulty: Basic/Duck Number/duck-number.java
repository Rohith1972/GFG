// User function Template for Java

class Solution {
    static boolean check_duck(String N) {
        // code here
        char ch[] = N.toCharArray();
        if(ch[0]=='0')
            return false;
        for(int i=1;i<ch.length;i++){
            if(ch[i]=='0')
                return true;
        }
        return false;
    }
}