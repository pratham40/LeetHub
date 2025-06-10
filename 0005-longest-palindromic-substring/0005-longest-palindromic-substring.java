class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            String odd = helper(s,i,i);
            String even = helper(s,i,i+1);
            if(odd.length()>even.length()){
                if(ans.length()<odd.length()){
                    ans = odd;
                }
            }else{
                if(ans.length()<even.length()){
                    ans = even;
                }
            }
        }
        return ans;
    }

    public String helper(String s,int i,int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return s.substring(i+1,j);
    }
}