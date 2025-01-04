package DAY3;
import java.util.ArrayList;
import java.util.Scanner;
class Solution {
    public int[][] generate(int numRows) {
        // Initialize the 2D array for Pascal's Triangle
        int[][] arr = new int[numRows][];
        int row=1;
        for(int i=1;i<=row;i++){
            for(int j=0;j<i;j++){
                arr[i] = new int[i + 1];
                if(j>0 && j<row-1){
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
                else{
                    arr[i][j]=1;
                }
            }row++;
            System.out.println("");
        }
        return arr;
    }
}
public class dsa2{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("no of rows:");
        int numRows=sc.nextInt();
        
        Solution s=new Solution();
        s.generate(numRows);
    }
}
