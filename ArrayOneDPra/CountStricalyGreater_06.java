// count the number of elements strictly greater.
package ArrayOneDPra;

public class CountStricalyGreater_06 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 12, 32, 34, 10, 11};
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println( );
        int x = 4;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]> x){
                count++;
                continue;
            }
        }
        System.out.println(count + " Strictly greater to  " + x );
    }
}
