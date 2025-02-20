//prime number: time exceeded

public class Solution {
	public static String isPrime(int num) {
		int c=0;
		boolean s;
		for(int i=1; i<=num;i++){
			if(num==1){
				break;
			}
			if(num%i==0){
				c++;
			}
		}
		if(c>2 || num==1){
			return "NO";
		}
		else{
			return "YES";
		}
		
	}
}
