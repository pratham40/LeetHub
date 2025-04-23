class Solution {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> ls = new ArrayList<>();
        helper(root,ls);
        int i=0;
        int j=ls.size()-1;
        while(i<j){
            int x = ls.get(i)+ls.get(j);
            if(x==k){
                return true;
            }
            else if(x>k){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
    void helper(TreeNode root,List<Integer> ls){
        if(root==null) return;
        helper(root.left,ls);
        ls.add(root.val);
        helper(root.right,ls);
    }
}