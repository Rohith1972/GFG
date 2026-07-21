class Solution {
    public int cutRod(int[] price) {
        // code here
        int n = price.length;
        int[][] dp = new int[n][n+1];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }
        return solve(n-1,0,n,price,dp);
    }
    int solve(int ind,int currLength,int maxLength, int[] price,int[][] dp){
        if(ind==0){
            return (maxLength-currLength)*price[0];
        }
        if(dp[ind][currLength]!=-1)
            return dp[ind][currLength];
        int notTake = solve(ind-1,currLength,maxLength,price,dp);
        int take = Integer.MIN_VALUE;
        int present = ind+1;
        if(present <= maxLength-currLength){
            take = price[ind] + solve(ind,currLength+present,maxLength,price,dp);
        }
        return dp[ind][currLength] = Math.max(take,notTake);
    }
}