class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i:arr1){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[n];
        int j=0;
        for(int i=0;i<m;i++){
            int count=freq.get(arr2[i]);
            while(count-->0){
                ans[j]=arr2[i];
                j++;
            }
            freq.put(arr2[i],0);
        }
        int x=j;
        for(int key:freq.keySet()){
            if(freq.get(key)>0){
                int count = freq.get(key);
                while(count-->0){
                    ans[x]=key;
                    x++;
                }
            }
        }
        Arrays.sort(ans,j,x);
        return ans;
    }
}