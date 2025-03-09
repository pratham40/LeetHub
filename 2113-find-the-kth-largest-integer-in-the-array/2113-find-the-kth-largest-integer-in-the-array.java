import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<BigInteger> pq = new PriorityQueue<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            BigInteger x=new BigInteger(nums[i]);
            pq.add(x);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return String.valueOf(pq.peek());
    }
}