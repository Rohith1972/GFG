// User function Template for Java

class Solution {
    static int isSquare(String S)
    {
        // code here
        long num = 0;
        char[] ch = S.toCharArray();
        for(int i=0;i<ch.length;i++){
            num += (int)ch[i];
        }
        if(isPerfectSquare(num))
            return 1;
        return 0;
    }
    static boolean isPerfectSquare(long num){
        double res = Math.floor(Math.sqrt(num));
        if(res*res == num)
            return true;
        return false;
    }
}