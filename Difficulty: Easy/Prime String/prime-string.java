// User function Template for Java

class Solution {
    public boolean isPrimeString(String s) {
        // code here.
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=(int)s.charAt(i);
        }
        if(isPrime(sum))
            return true;
        return false;
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
