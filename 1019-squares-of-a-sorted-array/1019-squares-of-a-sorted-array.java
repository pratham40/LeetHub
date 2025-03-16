class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int k=n-1;
        int[] ans = new int[n];
        while(left<=right){
            int sq1=nums[left]*nums[left];
            int sq2=nums[right]*nums[right];
            if(sq1>sq2){
                ans[k]=sq1;
                k--;
                left++;
            }else{
                ans[k]=sq2;
                k--;
                right--;
            }
        }
        return ans;
    }
}