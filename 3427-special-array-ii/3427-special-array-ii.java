class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] ans = new boolean[queries.length];
        int[] count = new int[nums.length];
        count[0]=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]%2!=nums[i-1]%2){
                count[i]=count[i-1];
            }else{
                count[i]=1+count[i-1];
            }
        }
        for(int i=0;i<queries.length;i++){
            int x=queries[i][0];
            int y=queries[i][1];
            ans[i]=true;
            if(count[y]-count[x]>0){
                ans[i]=false;
            }
        }
        return ans;
    }
}