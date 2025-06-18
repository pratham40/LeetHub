class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int r= nums.length/3;
        int[][] ans = new int[r][3];

        Arrays.sort(nums);

        int x=0;
        for(int i=0;i<r;i++){
            if(isValid(nums,x,x+3,k)){
                ans[i][0]=nums[x];
                ans[i][1]=nums[x+1];
                ans[i][2]=nums[x+2];
                x+=3;
            }else{
                return new int[][]{};
            }
        }

        return ans;
    }

    boolean isValid(int[] nums,int i,int j,int k){
        if(nums[j-1]-nums[i]>k){
            return false;
        }
        return true;
    }
}