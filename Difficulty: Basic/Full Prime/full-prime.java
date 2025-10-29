// User function Template for Java

class Solution {
    static int fullPrime(int N) {
        // code here
        int n = N;
        if(isPrime(N)){
            while(n!=0){
                int r = n%10;
                if(!isPrime(r))
                    return 0;
                n/=10;
            }
            return 1;
        }
        return 0;
    }
    static boolean isPrime(int num){
        if(num<2)
            return false;
        if(num==2 || num==3)
            return true;
        if(num%2==0 || num%3==0)
            return false;
        for(int i=5;i*i<=num;i+=6){
            if(num%i==0 || num%(i+2)==0)
                return false;
        }
        return true;
    }
}