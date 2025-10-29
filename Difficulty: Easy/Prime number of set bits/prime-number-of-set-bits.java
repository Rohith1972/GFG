// User function Template for Java
class Solution {
    public int primeSetBits(int L, int R) {
        // code here
        int cnt=0;
        for(int i=L;i<=R;i++){
            int n = i;
            int count = 0;
            while(n>0){
                n=n&(n-1);
                count++;
            }
            if(isPrime(count))
                cnt++;
        }
        return cnt;
        
    }
    static boolean isPrime(int num){
        if(num<2)
            return false;
        if(num==2||num==3)
            return true;
        if(num%2==0||num%3==0)
            return false;
        for(int i=5;i*i<=num;i+=6){
            if(num%i==0||num%(i+2)==0)
                return false;
        }
        return true;
    }
}