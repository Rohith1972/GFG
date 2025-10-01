// User function Template for Java

class Solution {
    int isRotatedPalindrome(String s) {
        // Your Code Here
        String S = s+s;
        for(int i=0;i<s.length();i++){
            String sub = S.substring(i,i+s.length());
            if(isPalindrome(sub))
                return 1;
        }
        return 0;
    }
    static boolean isPalindrome(String c){
        int i=0,j=c.length()-1;
        while(i<=j){
            if(c.charAt(i)!=c.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}