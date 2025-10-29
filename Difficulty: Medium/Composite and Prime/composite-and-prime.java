class Solution {
    public int Count(int l, int r) {
        // code here
        boolean p[] = new boolean[r+1];
        Arrays.fill(p,true);
        p[0]=false;
        p[1]=false;
        for(int i=2;i*i<=r;i++){
            if(p[i]==true){
                for(int j=i*i;j<=r;j+=i){
                    p[j]=false;
                }
            }
        }
        int primeCount=0;
        int compositeCount=0;
        for(int i=l;i<=r;i++){
            if(p[i])
                primeCount++;
            else
                compositeCount++;
        }
        return compositeCount-primeCount;
    }
}