class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n];
        for(int i=0;i<queries.length;i++){
            int start = queries[i][0];
            int end = queries[i][1];
            diff[start]+=1;
            if(end+1<n){
                diff[end+1]-=1;
            }
        }
        int[] res = new int[n];
        int cumsum=0;
        for(int i=0;i<n;i++){
            cumsum+=diff[i];
            res[i]=cumsum;
        }
        for(int i=0;i<n;i++){
            if(nums[i]>res[i]){
                return false;
            }
        }
        return true;
    }
}