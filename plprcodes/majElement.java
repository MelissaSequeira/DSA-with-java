class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        int c=nums.length/2;
        int res=0;
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int m:map.keySet()){
            if(map.get(m)>c){
                res=m;
                break;
            }
        }
        return res;
    }
}
