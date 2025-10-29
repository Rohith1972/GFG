// User function Template for Java

class Solution {

    static int isHappy(int N) {
        // code here
        HashSet<Integer> res = new HashSet<>();
        while(N!=1){
            res.add(N);
            N=happy(N);
            if(res.contains(N))
                return 0;
        }
        return 1;
    }
    static int happy(int num){
        int sum = 0;
        while(num!=0){
            int r = num%10;
            sum=sum+r*r;
            num/=10;
        }
        return sum;
    }
}