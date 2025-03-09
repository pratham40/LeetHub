class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for(int[] row:grid){
            Arrays.sort(row);
        }
        int ans=0;
        for(int j=0;j<grid[0].length;j++){
            int maxValue=Integer.MIN_VALUE;
            for(int i=0;i<grid.length;i++){
                maxValue=Math.max(maxValue,grid[i][j]);
            }
            ans+=maxValue;
        }
        return ans;
    }
}