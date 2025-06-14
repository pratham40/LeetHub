class Solution {
    void transposeMatrix(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = i; j < mat[i].length; j++) {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }
    void reverseArray(int[] arr){
        int i=0;
        int j= arr.length-1;
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[][] mat) {
        transposeMatrix(mat);
        for (int i = 0; i < mat.length; i++) {
            reverseArray(mat[i]);
        }
        // for (int i = 0; i < mat.length; i++) {
        //     for (int j = 0; j < mat[i].length; j++) {
        //         System.out.print(mat[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    }
}