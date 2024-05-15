package ArrayOneDPra;

public class CheckSortedOrNot_08 {
    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 8, 3, 900, 900};
        boolean flag = false;
        for(int i=1; i<arr.length; i++){
            if(arr[i-1] > arr[i]){
                flag = true;
                break;
            }
        }
        if(flag == true) System.out.println("Array is not Sorted ");
        else System.out.println("Array is sorted : ");
    }
}
