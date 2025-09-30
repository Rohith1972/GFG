// User function Template for Java

class Solution {
    public static int fun(String s, int k, int n, char c) {
        // Your code here
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==c)
                count++;
        }
        int num=n/s.length();
        int r = n%s.length();
        int count1=0;
        for(int i=0;i<r;i++){
            char ch = s.charAt(i);
            if(ch==c)
                count1++;
        }
        return (count*num)+count1;
    }
}