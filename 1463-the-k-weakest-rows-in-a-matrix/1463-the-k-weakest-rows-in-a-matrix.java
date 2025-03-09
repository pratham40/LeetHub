class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            if(a[0]==b[0]) 
                return a[1]-b[1]; // min heap
            else 
                return a[0]-b[0];
        });
        for(int i=0;i<mat.length;i++){
            int x=countSolider(mat[i]);
            pq.offer(new int[]{x,i});
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            int[] x = pq.poll();
            ans[i]=x[1];
        }
        return ans;
    }
    public int countSolider(int[] row){
        int cnt=0;
        for(int num:row){
            if(num==1) cnt++;
        }
        return cnt;
    }
}