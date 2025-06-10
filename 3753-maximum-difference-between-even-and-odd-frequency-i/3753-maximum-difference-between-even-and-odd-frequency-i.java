class Solution {
    public int maxDifference(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int maxFreq=-1;
        int minFreq=Integer.MAX_VALUE;

        for(char ch:map.keySet()){
            int freq = map.get(ch);
            if(freq%2==1){
                maxFreq=Math.max(maxFreq,freq);
            }else{
                minFreq=Math.min(minFreq,freq);
            }
        }
        return maxFreq-minFreq;
    }
}