class Solution {
    public long minimumSteps(String s) {
        int j=s.length()-1;
        int i=0;
        long sum=0;
        while(i<j){
            if(s.charAt(i)=='0'){
                i++;
            }else if(s.charAt(j)=='1'){
                j--;
            }else{
                sum+=j-i;
                i++;
                j--;
            }
        }
        return sum;
    }
}