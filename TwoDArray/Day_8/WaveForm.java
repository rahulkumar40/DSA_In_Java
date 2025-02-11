// write a program to print the matrix in Wave Form.
/* 
1 2 3 
4 5 6 
7 8 9 
Wave form
1 2 3
6 5 4
7 8 9
*/
package Day_8;

public class WaveForm {
    public static void main(String[] args) {
        int[][] arr ={{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = arr.length; 
        int n = arr[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println( );
        }
        System.out.println("Wave form ");
        for(int i=0; i<m; i++){
            if(i % 2 == 0){
                for(int j=0; j<n; j++){
                    System.out.print(arr[i][j] + " ");
                }
            }
            else{
                for(int j=n-1; j>=0; j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println( );
        }
    }
}
