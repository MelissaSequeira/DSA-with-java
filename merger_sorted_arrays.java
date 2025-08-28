class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> num1_copy=new ArrayList<>();
        ArrayList<Integer> num1=new ArrayList<>();
        for(int c:nums1){
                num1.add(c);
        }
        for(int k=num1.size()-1;k>=0;k--){
            if(num1.get(k)!=0){
                break;
            }else{
                num1.remove(k);
            }
        }
        
        int ptr1=0;
        int ptr2=0;
        int i=0;
        while (ptr1 < num1.size() && ptr2 < n) {
            if (num1.get(ptr1) <= nums2[ptr2]) {
                nums1[i++] = num1.get(ptr1++);
            } else {
                nums1[i++] = nums2[ptr2++];
            }
        }
        while (ptr1 < num1.size()) {
            nums1[i++] = num1.get(ptr1++);
        }

        // Copy remaining from nums2
        while (ptr2 < n) {
            nums1[i++] = nums2[ptr2++];
        }
    }
}
