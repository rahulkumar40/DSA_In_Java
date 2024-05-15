package Array_13;

public class SortZerosOnesAndTwo_1 {
    static void sortZeroOneAndTwo(int arr[]){
        int noOfZeros = 0, noOfOnes = 0, noOfTwos = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                noOfZeros ++;
            }
            if(arr[i] == 1){
                noOfOnes ++;
            }
            if(arr[i] == 2) noOfTwos ++;
        }
        System.out.println( noOfZeros + " , " + noOfOnes + " , " + noOfTwos);

        for(int i=0; i<arr.length; i++){
            if(i< noOfZeros){
                arr[i] = 0;
            }
            else if(i < noOfZeros + noOfOnes  ){
                arr[i] = 1;
            }
            else{
                arr[i] = 2;
            }
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 2, 1, 0 , 0, 1, 2, 0, 1, 0};
        for(int i :  arr){
            System.out.print(i + " " );
        }
        System.out.println( );
        sortZeroOneAndTwo(arr);

    }
}
