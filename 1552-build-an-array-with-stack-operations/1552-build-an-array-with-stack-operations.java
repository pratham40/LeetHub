class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int j=1;
        int idx=0;
        while(idx<target.length){
            if(target[idx]==j){
                ans.add("Push");
                idx++;
                j++;
            }else{
                ans.add("Push");
                ans.add("Pop");
                j++;
            }
        }
        return ans;
    }
}