class Solution {
    public int maxDiff(int num) {
        int maxValue = Integer.MIN_VALUE;
        int minValue=Integer.MAX_VALUE;

        String str = ""+num;

        for(int i=0;i<str.length();i++){
            String x = str.replace(str.charAt(i),'9');
            maxValue = Math.max(maxValue,Integer.parseInt(x));
        }

        for(int i=0;i<str.length();i++){
            if(i==0 && str.charAt(i)!=1){
                String x = str.replace(str.charAt(i),'1');
                minValue = Math.min(minValue,Integer.parseInt(x));
            }else if(i>0 && str.charAt(i)!=str.charAt(0)){
                String x = str.replace(str.charAt(i),'0');
                minValue = Math.min(minValue,Integer.parseInt(x));
            }
        }

        return maxValue-minValue;
    }
}