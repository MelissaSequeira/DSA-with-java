//gcd and lcm
class Solution {
    public static int[] lcmAndGcd(int a, int b) {
       int n;
       int c=1;
       int[] arr= new int[2];
        if(a>b){
            n=a;
        }
        else{
            n=b;
        }
        for(int i=1;i<=n;i++){
            if(a%i==0 && b%i==0){
                c=i;
            }
        }
        int lcm=(a*b)/c;
        arr[0]=lcm;
        arr[1]=c;
        return arr;
    }
}
