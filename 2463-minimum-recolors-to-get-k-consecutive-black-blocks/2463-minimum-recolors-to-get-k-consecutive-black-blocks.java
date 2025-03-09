class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int minWhiteCount=Integer.MAX_VALUE;
        for(int i=0;i<n-k+1;i++){
            int whiteCount=0;
            for(int j=i;j<k+i;j++){
                if(blocks.charAt(j)=='W'){
                    whiteCount++;
                }
            }
            minWhiteCount=Math.min(whiteCount,minWhiteCount);
        }
        return minWhiteCount;
    }
}