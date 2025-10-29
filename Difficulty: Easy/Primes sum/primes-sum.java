// User function Template for Java
class Solution {
    static String isSumOfTwo(int n) {
        // code here
        for(int i=0;i<=n/2;i++){
            if(isPrime(i)&&isPrime(n-i))
                return "Yes";
        }
        return "No";
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