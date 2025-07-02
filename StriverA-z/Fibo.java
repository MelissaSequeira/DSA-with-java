import java.util.Scanner;

public static int fibo(int n){
    int f0=0;
    int f1=1;
    if (f0==0 || f1==1){
        return 1;
    }else{
        return fibo()
    }
}

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int ans = fibo(n);

    }
}
