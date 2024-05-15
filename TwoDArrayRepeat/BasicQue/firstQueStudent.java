/*
 * write a java program to store roll number and marks 
 * obtainded by 4 student side by side in a matrix.
 */
package BasicQue;

import java.util.Scanner;

public class firstQueStudent {
    static void printMatrix(int arr[][]){
        int m = arr.length; 
        int n = arr[0].length; 
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + "                      ");
            }
            System.out.println( );
        }
    }
    public static void main(String[] args) {
        int studentMatrix [][] = new int[4][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rool number and marks : "); 

        int m = studentMatrix.length; 
        int n = studentMatrix[0].length; 

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                studentMatrix[i][j] = sc.nextInt();
            }
            System.out.println( );
        }

        System.out.println("Roll No.                 Marks ");
        printMatrix(studentMatrix);
    }
}