package ReverseArray;
/**
 * ReverseWithinArray
 */
public class ReverseWithinArray {

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void rotate(int arr[]){

        int i=0, j=arr.length-1;
        while (i<j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    static void printArray(int arr[]){
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};

        rotate(arr);
        printArray(arr);

    }
}