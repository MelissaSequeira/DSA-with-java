package DAY5;
import java.util.Scanner;

public class dsa1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements in array:");
    int n=sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int min=arr[0];
    int c=0;
    for(int i=0;i<n;i++){
        if(arr[i]<min){
            min=arr[i];
            c=i;
        }
    }
    System.out.println("min is "+min);
    int[] arr1 = new int[n-c];
    int prof0=arr1[0];
    int prof2=0;
    
    for(int i=0;i<n-1;i++){
       arr1[i]=arr[i+1]-min;
        
    }
    for(int i=0 ; i<n-1;i++){
        if(prof0<arr1[i])
        {
            prof0=arr1[i];
        }
    }
    System.out.println("max prof:"+prof0);
    }
}
