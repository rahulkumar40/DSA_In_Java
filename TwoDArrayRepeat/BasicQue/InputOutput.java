package BasicQue;

import java.util.Scanner;

public class InputOutput {
    static void printMatrix(int arr[][]){
        int m = arr.length; 
        int n = arr[0].length; 
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println( );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][4];
        int m = arr.length; 
        int n = arr[0].length; 

        System.out.println("Enter the array element : ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array : ");
        printMatrix(arr);
    }
}
