class Solution {
    public void setZeroes(int[][] matrix) {
        List<int[]> map = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    int[] x = new int[2];
                    x[0]=i;
                    x[1]=j;
                    map.add(x);
                }
            }
        }
        System.out.println(map);
        for(int[] y:map){
            int r = y[0];
            int c = y[1];
            for(int i=0;i<matrix[0].length;i++){
                matrix[r][i]=0;
            }
            for(int j=0;j<matrix.length;j++){
                matrix[j][c]=0;
            }
        }
    }
}