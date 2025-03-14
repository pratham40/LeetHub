class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int firstNeg=helper(0,n-1,nums,-1);
        int firstPos=helper(firstNeg,n-1,nums,0);
        return Math.max(firstNeg,n-firstPos);
    }
    int helper(int start,int end,int[] nums,int tar){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<=tar){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return start;
    }
}