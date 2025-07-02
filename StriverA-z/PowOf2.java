import java.util.Scanner;

public class PowOf2 {
    public static boolean isPowerOfTwo(int n) {
        
        if(n==1){ //n != 1
            return true;
        }
        //<--
        if(n%2!=0 || n<=1){//<--6%2=0 <--3%2!=0
            return false;
        }
        
                return isPowerOfTwo(n/2);//3
    
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Boolean ans =isPowerOfTwo(n);
            System.out.print(ans + " ");
    }
}
