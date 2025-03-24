class Solution {
    public int numSpecial(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int cnt=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    if(helper(mat,i,j)){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
    boolean helper(int[][] mat,int i,int j){
        for(int x=0;x<mat.length;x++){
            if(mat[x][j]==1 && x!=i){
                return false;
            }
        }
        for(int x=0;x<mat[0].length;x++){
            if(mat[i][x]==1 && x!=j){
                return false;
            }
        }
        return true;
    }
}