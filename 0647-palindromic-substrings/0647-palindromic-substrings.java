class Solution {
    public int isPalindrome(int i,int j,String s){
        int x=0;
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
            x++;
        }
        return x;
    }
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            int a1=isPalindrome(i,i,s);
            int a2=isPalindrome(i,i+1,s);
            count+=a1+a2;
        }
        return count;
    }
}