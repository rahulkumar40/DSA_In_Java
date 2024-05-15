package Day_7;

public class NewTranformINToTran {
    static void printArr(int[][] arr){
        int m=arr.length; 
        int n = arr[0].length; 
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println( );
        }
        System.out.println( );
    }
    public static void main(String[] args) {
        int [][] arr= {{1, 2, 3}, {5, 6, 7}, {5, 8, 9}};
        printArr(arr);
        int m=arr.length; 
        for(int i=0; i<m; i++){

            for(int j=0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp ;
            }
        }

        printArr(arr);
    }
}
