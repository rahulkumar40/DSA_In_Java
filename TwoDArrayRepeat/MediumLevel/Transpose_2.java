package MediumLevel;

public class Transpose_2 {
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
    static void swap(int arr[][], int i, int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp ;
    }
    public static void main(String[] args) {
        int arr[][] = {{4, 5, 6}, {3, 5, 1}, {6, 7, 8}};
        int  m = arr.length;  
        System.out.println("Original Array : ");
        printMatrix(arr);

        System.out.println("Answer Array : ");
        for(int i=0; i<m; i++){
            for(int j=0; j<i; j++){
                swap(arr, i, j);
            }
        }
        printMatrix(arr);
    }
}
