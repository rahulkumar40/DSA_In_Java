/*
 * write a java program to find largest element to 2D array.
 */

package BasicQue;

public class LargestElement {
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
        int arr[][] ={{4, 6, 8}, {64, 32, 24}, {43, 63, 23}};
        int m = arr.length, n=arr[0].length; 
        int maxEle = Integer.MIN_VALUE; 
        
        System.out.println("Original Array : ");
        printMatrix(arr);
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] > maxEle){
                    maxEle = arr[i][j];
                }
            }
        }
        System.out.println("Max element : " + maxEle );
    }
}
