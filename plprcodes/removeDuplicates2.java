class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int m :nums){
            map.put(m,map.getOrDefault(m,0)+1);
        }
        for(int mkey:map.keySet()){
            temp.add(mkey);
            if(map.get(mkey)>1){
                temp.add(mkey);
            }
        }
        int i=0;
        int[] res = new int[temp.size()];
        for(int z:temp){
            res[i++]=z;
        }
        Arrays.sort(res);
        i=0;
        for(int t:res){
            nums[i++]=t;
        }

        return res.length;
    }
}
