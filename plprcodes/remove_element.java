class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0;
        Arrays.sort(nums);
        int n=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val)
            {int j=i;
              while(j<n && nums[j]==val){
                  int temp=nums[j];
                nums[j]=nums[n];
                nums[n]=temp;
                j++;
                n--;
              }
            }
        }
        for(int m:nums){
            if(m!=val){
                c++;
            }
        }
        return c;
    }
}
