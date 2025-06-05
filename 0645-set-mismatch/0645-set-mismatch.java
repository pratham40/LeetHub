class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int idxx=-1;
        int dupp =-1;
        for(int i=0;i<nums.length;i++){
            int idx=Math.abs(nums[i]);
            if(nums[idx-1]<0){
                dupp=Math.abs(nums[i]);
            }else{
                nums[idx-1]=-1*nums[idx-1];
            }
        }
        ans[0]=dupp;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[1]=i+1;
                break;
            }
        }
        return ans;
    }
}