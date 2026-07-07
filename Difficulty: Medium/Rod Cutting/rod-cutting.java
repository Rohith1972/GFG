class Solution {
    public int cutRod(int[] price) {
        // code here
        int n = price.length;
        int[] dp = new int[n+1];
        for(int i=1;i<=n;i++){
            int maxProfit=0;
            for(int j=1;j<=i;j++){
                maxProfit = Math.max(maxProfit,price[j-1]+dp[i-j]);
            }
            dp[i] = maxProfit;
        }
        return dp[n];
    }
}