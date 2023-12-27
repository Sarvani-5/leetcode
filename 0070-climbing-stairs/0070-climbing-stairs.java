class Solution {
    public int climb(int n,int[] dp){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int result = climb(n-1,dp)+climb(n-2,dp);
        dp[n]=result;
        return dp[n];
    }
    public int climbStairs(int n) {
         int[] dp = new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        return climb(n,dp);
    }
}