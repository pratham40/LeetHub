class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> evenParity=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> oddParity=new PriorityQueue<>(Collections.reverseOrder());
        String x=String.valueOf(num);
        for(int i=0;i<x.length();i++){
            int dig=x.charAt(i)-'0';
            if(dig%2==0){
                evenParity.add(dig);
            }else{
                oddParity.add(dig);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<x.length();i++){
            int dig=x.charAt(i)-'0';
            if(dig%2==0){
                sb.append(evenParity.poll());
            }else{
                sb.append(oddParity.poll());
            }
        }
        return Integer.parseInt(sb.toString());
    }
}