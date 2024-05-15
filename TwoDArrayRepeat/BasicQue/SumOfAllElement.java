/*
 * write a program to add all element of 2D array or matrix. 
 */
package BasicQue;

public class SumOfAllElement {
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
        int arr[][] = {{1, 2, 3}, {4, 5, 4}, {7, 9, 0}};
        int m = arr.length; 
        int n = arr[0].length; 
        printMatrix(arr);

        int totalSum = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                totalSum += arr[i][j];
            }
        }

        System.out.println("Total Sum = "+ totalSum);
        
    }
}
