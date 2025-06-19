class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);

        int minVal=nums[0];
        int cnt=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-minVal>k){
                cnt++;
                minVal=nums[i];
            }
        }

        return cnt+1;
    }
}