// User function Template for Java

class Solution {
    public int convertToEven(String s) {
        // Your code goes here
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='O' && (i==0 || s.charAt(i-1)=='E'))
                count++;
        }
        return count;
    }
}