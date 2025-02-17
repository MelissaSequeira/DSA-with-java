public class Solution {
    public static int countDigits(int n){
        int m=n;
        int p;
        String s = String.valueOf(n);

        int[] arr=new int[s.length()];
       for (int i = 0; i < s.length(); i++){
            arr[i]=Character.getNumericValue(s.charAt(i));
        }
        int c=0;
        for (int i = 0; i < s.length(); i++) {
            if (arr[i] != 0 && n % arr[i] == 0) {  // Avoid division by zero
                c++;
            }
        }
         return c;
    }
   
}
