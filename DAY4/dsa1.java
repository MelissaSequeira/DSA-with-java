package DAY4;
// import java.util.Scanner;

// public class dsa1{
// public static void main(String[] args) {
//     Scanner sc =new Scanner(System.in);
//     System.out.println("Enter the number of rows:");
//     int r=sc.nextInt();
//     int[][] matrix=new int[r][];
//     for(int i=0;i<r;i++){
//         matrix[i] = new int[i + 1];
//         System.out.print("[");
//         for(int j=0;j<=i;j++){
//             if(j==0 || j==i){
//                 matrix[i][j]=1;
//                 System.out.print(matrix[i][j]+",");;
//             }
//             else{
//                 matrix[i][j]=matrix[i-1][j-1]+matrix[i-1][j];
//                 System.out.print(matrix[i][j]+",");;
//             }
//         }
//         System.out.print("]");
//         System.out.println("");
//     }
// }
// }
import java.util.ArrayList;
import java.util.List; 
import java.util.Scanner;
import java.util.Arrays;

class Solution {
    public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> matrix = new ArrayList<>();

    for(int i=0;i<numRows;i++){
        
        List<Integer> row=new ArrayList<>();
        for(int j=0;j<=i;j++){
            if(j==0 || j==i){
                row.add(1);
                // matrix[i][j]=1;
            }
            else{
                row.add(matrix.get(i-1).get(j-1)+matrix.get(i-1).get(j));
                // matrix[i][j]=matrix[i-1][j-1]+matrix[i-1][j];
            }
        }
        matrix.add(row);
    }
    return matrix;
    }
}

public class dsa1{
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    int newRows=sc.nextInt();
    Solution s = new Solution();
    List<List<Integer>> matrix= new ArrayList<>();
     matrix=s.generate(newRows);
    for(int i=0;i<newRows;i++){
        System.out.print("[");
        for(int j=0;j<=i;j++)
        {
            System.out.print(matrix.get(i).get(j));
            if(j<i){
                System.out.print(",");
            }
        }
        System.out.print("]");
    System.out.println("");    
    }
}
}
