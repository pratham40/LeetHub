class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> ls = new ArrayList<>();
        
        for(int i=1;i<=n;i++){
            ls.add(i);
        }
        
        return helper(ls,0,k);
    }
    public int helper(List<Integer> ls ,int idx,int k){
        if(ls.size()==1 || idx>ls.size()){
            return ls.get(0);
        }
        
        if(ls.size()>0){
            idx=(idx+k-1)%ls.size();
            ls.remove(idx);
            helper(ls,idx,k);
        }
        
        return ls.get(0);
    }
}