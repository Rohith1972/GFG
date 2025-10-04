// User function Template for Java

class Solution {
    int isValid(String s, int n) {
        // your code here
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R')
                count=0;
            else{
                count++;
                if(count>n)
                return 0;
            }
        }
        return 1;
    }
}
