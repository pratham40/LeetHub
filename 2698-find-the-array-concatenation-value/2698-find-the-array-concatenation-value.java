class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int left=0;
        int right=nums.length-1;
        long ans=0;
        while(left<=right){
            String str="";
            if(left!=right){
                str=""+nums[left]+nums[right];
            }else{
                str=""+nums[left];
            }
            ans+=Long.parseLong(str);
            left++;
            right--;
        }
        return ans;
    }
}