// wap to find the largest three element in the array 
package ArrayOneDPra;

public class TreeLargestElement_07 {
    public static void main(String[] args) {
        int arr[] = {300, 50, 2, 700, 8, 23, 45};
        int max = Integer.MIN_VALUE;
        int seconMax = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        int n = arr.length; 
        for(int i=0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i] > seconMax && max != arr[i]){
                seconMax = arr[i];
            }
        }

        for(int i=0; i<n; i++){
            if(arr[i] > third && max != arr[i] && arr[i] != seconMax){
                third = arr[i];
            }
        }

        System.out.println("1st max : " + max);
        System.out.println("2st max : " + seconMax);
        System.out.println("3st max : " + third);

    }
}
