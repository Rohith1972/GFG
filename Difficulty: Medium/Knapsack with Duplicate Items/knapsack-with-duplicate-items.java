class Solution {
    public int knapSack(int val[], int wt[], int capacity) {
        // code here
        int[][] dp = new int[val.length][capacity+1];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }
        return solve(val.length-1,0,capacity,val,wt,dp);
    }
    int solve(int ind,int target,int capacity,int[] val,int[] wt,int[][] dp){
        if(ind == 0){
            int remaining = capacity-target;
            return (remaining/wt[0])*val[0];
        }
        if(dp[ind][target]!=-1)
            return dp[ind][target];
        int notTake = solve(ind-1,target,capacity,val,wt,dp);
        int take = Integer.MIN_VALUE;
        if(wt[ind]+target<=capacity){
            take = val[ind]+solve(ind,target+wt[ind],capacity,val,wt,dp);
        }
        return dp[ind][target] = Math.max(take,notTake);
    }
}