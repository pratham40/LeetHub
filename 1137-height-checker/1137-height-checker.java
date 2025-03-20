class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone(); // clone means creating an exact copy on an object shallow copy create new instance
        countSort(expected); // N+K
        int cnt=0;
        int n = expected.length;
        for(int i=0;i<n;i++){
            if(expected[i]!=heights[i]){
                cnt++;
            }
        }
        return cnt;

    }
    void countSort(int[] nums){
        int[] count= new int[101];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int j=0;
        for(int i=1;i<=100;i++){
            while(count[i]>0){
                nums[j]=i;
                count[i]--;
                j++;
            }
        }
    }
}