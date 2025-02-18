//armstrong
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		String s=String.valueOf(num);
		int n=s.length();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=Character.getNumericValue(s.charAt(i));
		}
		int sum=0;
		for(int i=0; i<n; i++){
			sum=sum+arr[i]*arr[i]*arr[i];
		}
		boolean res;
		if(sum==num){
			 res=true;
		}
		else{
			res=false;
		}
		System.out.println(res);
	}
}
