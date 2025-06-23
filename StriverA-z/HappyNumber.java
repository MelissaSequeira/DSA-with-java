import java.util.HashSet;
import java.util.Scanner;

public class HappyNumber {
    public static boolean isHappy(int n) {
        HashSet<Integer> set= new HashSet<>();
        while(!set.contains(n)){
            if(n==1){
                return true;
               
            }
            
            set.add(n);
            n=sumSet(n);
        }   
        return false;
    }
    public static int sumSet(int n){
        int sum=0;
        while(n!=0){
            int m=n%10;
            sum=sum+m*m;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Boolean ans = isHappy(n);
            System.out.print(ans + " ");
    }
}
