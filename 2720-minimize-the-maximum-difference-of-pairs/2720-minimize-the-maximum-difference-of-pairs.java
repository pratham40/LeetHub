class Solution {
    public int minimizeMax(int[] nums, int p) {
        if(p==0) return 0;
        Arrays.sort(nums);
        int n=nums.length;
        int l=0;
        int r=nums[n-1]-nums[0];
        int minDiff=Integer.MAX_VALUE;
        while(l<=r){
            int mid=l+(r-l)/2;

            if(helper(nums,mid,p)){
                minDiff=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return minDiff;
    }

    boolean helper(int[] nums,int mid,int p){
        int i=0;
        int cnt=0;
        while(i<nums.length-1){
            if(Math.abs(nums[i]-nums[i+1])<=mid){
                cnt++;
                i+=2;
                if(cnt>=p){
                    return true;
                }
            }else{
                i++;
            }
        }
        return false;
    }
}