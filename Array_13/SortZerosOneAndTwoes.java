package Array_13;

public class SortZerosOneAndTwoes {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 0, 0, 1, 2};

        int n = arr.length; 
        int mid = 0, hi = n -1 , lo = 0; 

        while (mid<=hi) {
            if(arr[mid] == 0){
                int temp = arr [mid];
                arr[mid] = arr[lo];
                arr[lo] = temp;
                lo++;
                mid++;
            }

            else if(arr[mid] == 1){
                mid ++;
            }
            else{
                // arr[mid] == 2 
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--;
            }
            
        }
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}
