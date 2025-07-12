class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp = new int[m][n];
        for(int[] x:dp){
            Arrays.fill(x,-1);
        }
        return helper(m-1,n-1,grid,dp);
    }
    int helper(int i,int j,int[][] grid,int[][] dp){
        if(i==0 && j==0 && grid[i][j]!=1){
            return 1;
        }

        if(i<0 || j<0 || grid[i][j]==1){
            return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int up=helper(i-1,j,grid,dp);
        int left=helper(i,j-1,grid,dp);
        return dp[i][j]= up+left;
    }
}