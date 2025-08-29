class Solution {
    public int removeDuplicates(int[] nums) {
       HashSet<Integer> set= new HashSet<>();
       for(int n:nums){
        set.add(n);
       }
       int u=0;
       int[] arr=new int[set.size()];
       for(int k:set){
        arr[u++]=k;
       }
       Arrays.sort(arr);
       int i=0;
       for(int m:arr){
        nums[i++]=m;
       }
       
       return set.size();
    }
}
