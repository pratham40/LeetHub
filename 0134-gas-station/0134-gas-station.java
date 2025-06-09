class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int gasSum=0;
        int costSum=0;
        int pos=0;
        int currCap=0;
        for(int i=0;i<n;i++){
            currCap+=gas[i]-cost[i];
            if(currCap<0){
                pos=i+1;
                currCap=0;
            }
            gasSum+=gas[i];
            costSum+=cost[i];
        }
        if(costSum>gasSum) return -1;
        return pos;
    }
}