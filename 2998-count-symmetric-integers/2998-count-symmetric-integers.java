class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int cnt=0;
        while(low<=high){
            String num = Integer.toString(low);
            if(num.length()%2==1) {low++; continue;}
            int i=0;
            int j=num.length()-1;
            int sum1=0;
            int sum2=0;
            while(i<j){
                sum1+=num.charAt(i)-'0';
                sum2+=num.charAt(j)-'0';
                i++;
                j--;
            }
            if(sum1==sum2){
                cnt++;
            }
            low++;
        }
        return cnt;
    }
}