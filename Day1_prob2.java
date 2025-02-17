public class Solution {
    public static boolean palindromeNumber(int n){
       boolean res=true;
       String s=String.valueOf(n);
       int no=s.length();
       int[] arr=new int[no];
       int k=0;
       for(int i=no-1;i>=0;i--){
           arr[i]=Character.getNumericValue(s.charAt(k));
           k++;
       } 
        for(int i=0;i<no;i++){
            if(arr[i]!=Character.getNumericValue(s.charAt(i))){
                res=false;
                break;
            }
       }   
return res;
    }
}
