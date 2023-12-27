class Solution {
    public int fibonacci(int n,int[] dp){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int result = fibonacci(n-1,dp)+fibonacci(n-2,dp);
        dp[n]=result;
        return dp[n];
    } 
    public int fib(int n) {
        int[] dp = new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        return fibonacci(n,dp);
    }
}