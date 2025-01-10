package DAY7;
import java.util.*;
class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]<0){
                    c++;
                }
            }
            
        }
        return c;
    }
}

public class dsa1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size main array:");
        int n=sc.nextInt();
        System.out.println("Enter the size of sub array:");
        int m=sc.nextInt();
        int[][] grid = new int[n][m];
        for(int i=0;i<n;i++){
            System.out.println("enter elements row "+i);
            for(int j=0;j<m;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        System.out.println("grid:");
        System.out.print("[");
        for(int i=0;i<n;i++){
            System.out.print("[");
            for(int j=0;j<m;j++){
                System.out.print(grid[i][j]);
                if(j<m-1){
                    System.out.print(",");
                }
            }
            
            System.out.print("]");
            System.out.print(",");
            System.out.println("");
        }System.out.print("]");
        Solution s=new Solution();
       int res= s.countNegatives(grid);
       System.out.println("number of negative in grid:"+res);
        
    }
}