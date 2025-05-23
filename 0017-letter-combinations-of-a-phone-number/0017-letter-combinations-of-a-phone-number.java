class Solution {
    void letterCombinations(String dig,String[] kp,String res,ArrayList<String> ans){
        if (dig.length()==0){
            ans.add(res);
            return ;
        }
        int currNum=dig.charAt(0)-'0';
        String currChoice=kp[currNum];
        for (int i = 0; i < currChoice.length(); i++) {
            letterCombinations(dig.substring(1),kp,res+currChoice.charAt(i),ans);
            
        }
    }

    public List<String> letterCombinations(String digits) {
        String[] kp={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ArrayList<String> ans = new ArrayList<>();
        if(digits.length()==0){
            return ans;
        }
        letterCombinations(digits,kp,"",ans);
        return ans;
    }   
}