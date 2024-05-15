package BasicQue;

public class SumOfTwoMatrix {
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
        int matrix_1 [][] = {{1, 2, 3}, {4, 5, 6}, {6, 7, 8}};
        int matrix_2 [][] = {{3, 4, 5}, {5, 3, 2}, {7, 6, 8}};

        int n = matrix_1.length; 
        int sumMatrix[][] = new int[n][n];

        if(matrix_1.length != matrix_2.length){
            return;
        }
        else{
            for(int i=0; i<n; i++ ){
                for(int j=0; j<n; j++){
                    sumMatrix[i][j] = matrix_1[i][j] + matrix_2[i][j];
                }
            }
        }
        System.out.println("First matrix and second matrix : ");
        printMatrix(matrix_1);
        System.out.println( );
        printMatrix(matrix_2);
        System.out.println("Sum of Tow Matrix : ");
        printMatrix(sumMatrix);

    }
}
