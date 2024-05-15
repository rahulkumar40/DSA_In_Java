// find the minimum value out of all elements in the array 
package ArrayOneDPra;

public class MinValueInArray_03 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 1, 6, 8, 9, 11};

    int min = Integer.MAX_VALUE;

    for(int i=0; i<arr.length; i++){
        if(arr[i] < min){
            min = arr[i];
        }
    }
    System.out.println("Min Value : " + min);
    
}

}
