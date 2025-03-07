class Solution {
    public int[] closestPrimes(int left, int right) {
        // seive of erosthiness 
        // use to find the sequence of prime no 
        // nloglogn
        // much better than nsqrtn
        boolean[] prime = new boolean[right+1];
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i*i<prime.length;i++){
            if(prime[i]){
                for(int j=i*i;j<prime.length;j+=i){
                    prime[j]=false;
                }
            }
        }
        List<Integer> temp=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(prime[i]){
                temp.add(i);
            }
        }
        if(temp.size()<=1){
            return new int[]{-1,-1};
        }
        if(temp.size()==2){
            return new int[]{temp.get(0),temp.get(1)};
        }
        int num1=-1;
        int num2=-1;
        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i<temp.size()-1;i++){
            int currDiff=temp.get(i+1)-temp.get(i);
            if(currDiff<minDiff){
                num1=temp.get(i);
                num2=temp.get(i+1);
                minDiff=currDiff;
            }
        }
        return new int[]{num1,num2};
    }
}