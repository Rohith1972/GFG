// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        int x = n;
        int sum = 0;
        while(n!=0){
            int r = n%10;
            sum+=r*r*r;
            n/=10;
        }
        if(sum == x){
            return true;
        }
        return false;
    }
}