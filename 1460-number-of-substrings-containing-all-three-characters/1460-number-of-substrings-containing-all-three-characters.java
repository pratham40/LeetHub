class Solution {
    public int numberOfSubstrings(String s) {
        int cnt=0;
        int left=0;
        int n=s.length();
        int[] freq = new int[3];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                cnt+=n-i;
                freq[s.charAt(left)-'a']--;
                left++; 
            }
        }
        return cnt;
    }
}