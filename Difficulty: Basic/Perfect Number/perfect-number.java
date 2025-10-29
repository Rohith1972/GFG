// User function Template for Java

class Solution {
    int isPerfect(int N) {
        // code here
        int num = N; 
        int sum =0;
        while(num!=0){
            int r = num%10;
            sum+=fact(r);
            num/=10;
        }
        if(sum==N)
            return 1;
        return 0;
    }
    static int fact(int num){
        int fact = 1;
        if(num<2)
            return 1;
        else
            for(int i=2;i<=num;i++){
                fact*=i;
            }
        return fact;
    }
}