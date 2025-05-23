class Solution {
    public int minPathSum(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] dp = new int[m][n];
        dp[0][0]=mat[0][0];

        for(int i=1;i<n;i++){
            dp[0][i]=dp[0][i-1]+mat[0][i];
        }

        for(int j=1;j<m;j++){
            dp[j][0]=dp[j-1][0]+mat[j][0];
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=mat[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m-1][n-1];
    }
}