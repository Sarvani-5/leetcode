class Solution {
    public int unique(int m,int n,int i,int j,int[][] dp,int[][] grid){
        if(i==m || j==n || grid[i][j]==1){
            return 0;
        }
        if(i==(m-1) && j==(n-1)){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int down = unique(m,n,i+1,j,dp,grid);
        int right = unique(m,n,i,j+1,dp,grid);
        int ways = down+right;
        dp[i][j]=ways;
        return dp[i][j];
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int i=0,j=0;
        int[][] dp = new int[m][n];
        for(int k=0;k<m;k++){
            for(int l=0;l<n;l++){
                dp[k][l]=-1;
            }
        }
        return unique(m,n,i,j,dp,obstacleGrid);
    }
}