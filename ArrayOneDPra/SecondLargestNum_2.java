// find the second largest element in the gicen array in one pass.
package ArrayOneDPra;

public class SecondLargestNum_2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 9, 11};
         
        int max = arr[0];
        int secMax = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        
        for(int i=0; i<arr.length; i++){
            if(secMax < arr[i] && max !=arr[i]){
                secMax = arr[i];
            }
        }
        System.out.println("Second Max : " + secMax);
    }
}
