class dsa1 {
    public int findLHS(int[] nums) {
        // ArrayList<Integer> n=new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     int m=nums[i];
        //     int c=0;
        //     for(int j=0;j<nums.length;j++){
        //         if(arr)
        //         n.add(c);
        //     }
        // }
        // int max=n.get(0);
        // for(int i=0;i<n.size();i++){
        //     if(n.get(i)>max){
        //         max=n.get(i);
        //     }
        // }
        // return max;
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0; i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int maxLen = 0;
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                int currentLen = map.get(key) + map.get(key + 1);
                if(currentLen>maxLen){
                maxLen=currentLen;
               }
            }
            
        }
        return maxLen;
    }
}