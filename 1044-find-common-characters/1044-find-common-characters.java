class Solution {
    public List<String> commonChars(String[] words) {
        int[] firstWord=new int[26];
        for(char ch:words[0].toCharArray()){
            firstWord[ch-'a']++;
        }
        for(int i=1;i<words.length;i++){
            int[] currFreq=new int[26];
            String currWord=words[i];
            for(char ch:currWord.toCharArray()){
                currFreq[ch-'a']++;
            }
            for(int x=0;x<26;x++){
                firstWord[x]=Math.min(firstWord[x],currFreq[x]);
            }
        }
        List<String> ans = new ArrayList<>();
        for(int i=0;i<26;i++){
            if(firstWord[i]>0){
                char ch=(char)(i+'a');
                int count=firstWord[i];
                while(count-->0){
                    ans.add(ch+"");
                }
            }
        }
        return ans;
    }
}