package DAY6;
import java.util.Scanner;

class Solution {
    public int findChampion(int[][] grid) {
        int[] arr=new int[grid.length];
        for(int i=0;i< grid.length;i++){
            int c=0;
            for(int j=0;j<  grid.length;j++){
                if(grid[i][j]==1){
                    c++;
                }
            }arr[i]=c;
        }
        int max=0;
        int ind=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                ind=i;
            }
        }
        return ind;
    }

}

public class dsa1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] grid= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        System.out.println("TEams:");
        
        for(int i=0;i<n;i++){
            System.out.print("[");
            for(int j=0;j<n;j++){
                System.out.print(grid[i][j]);
                if(grid[i][j]<n-1){
                    System.out.print(",");
                }
            }
            System.out.print("]");
        }

        Solution s= new Solution();
        int m=s.findChampion(grid);
        System.out.println("Strong Team is:"+m);
        
    }
}
