package MediumLevel;

public class Tranpose_1 {
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
        int arr[][] = {{2, 3, 4}, {5, 6, 1}, {9, 7, 3}};
        
        int m = arr.length; 
        int n = arr[0].length; 

        System.out.println("Original Array : ");
        printMatrix(arr);
        
        System.out.println( " output : ");
        for(int j=0; j<n; j++){
            for(int i=0; i<m; i++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println( );
        }
    }
}
