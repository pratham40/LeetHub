class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        for(int i:nums){
            freq[i]++;
        }
        int maxFreq=Integer.MIN_VALUE;
        for(int i:freq){
            maxFreq=Math.max(maxFreq,i);
        }
        int ans=0;
        for(int i:freq){
            if(maxFreq==i){
                ans+=i;
            }
        }
        return ans;
    }
}