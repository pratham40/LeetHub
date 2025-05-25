class Solution {
    public void sortColors(int[] nums) {
        // Dutch National Flag Algo
        int left=0;
        int mid=0;
        int right=nums.length-1;
        while(mid<=right){
            if(nums[mid]==1){
                mid++;
            }else if(nums[mid]==0){
                swap(nums,mid,left);
                mid++;
                left++;
            }else{
                swap(nums,mid,right);
                right--;
            }
        }
    }
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}