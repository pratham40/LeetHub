class Solution {
    public int findCircleNum(int[][] isConnected) {
        int cnt=0;
        int n=isConnected.length;
        boolean[] vst = new boolean[n];
        for(int i=0;i<n;i++){
            if(!vst[i]){
                bfs(i,isConnected,vst);
                cnt++;
            }
        }
        return cnt;
    }
    public void bfs(int i,int[][] isConnected,boolean[] vst){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        vst[i]=true;
        while(!q.isEmpty()){
            int front = q.remove();
            int n = isConnected[front].length;
            for(int j=0;j<n;j++){
                if(isConnected[front][j]==1 && !vst[j]){
                    q.add(j);
                    vst[j]=true;
                }
            }
        }
    }
}