//write to find the duplicate elemnts from the given array of element.

package ArrayOneDPra;

public class DuplicateElement_04 {
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void Q(int arr[]){
        int l = 0, k=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                k++;
            }
            else{
                l++;
            }
        }

        for(int i=0; i<arr.length; i++){
            if(l>i && arr[i] != 0){
                arr[i] = arr[i];
            }
            else{
                arr[i] = 0;
            }
        }
        System.out.println( );
        for(int m : arr){
            System.out.print(m + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 0, 0, 1, 2, 0, 1, 8};
        // Q(arr);
    // int j=arr.length -1;
    int i=0,j = arr.length-1, l=0;
    while(i<j){
        if(arr[i] == 0){
            swap(arr, i,l);
            l++;
            i++;
        }
        else if(arr[i] != 0){
            i++;
        }
        else{
            int temp = arr[l];
            arr[l] = arr[j];
            arr[j] = temp ;
            j--;
        }
    }

        System.out.println( );
        for(int k : arr){
            System.out.print(k + " ");
        }
        int m =0, mm=arr.length-1;
        while (m < mm) {
            swap(arr, m, mm);
            m++;
            mm--;
        }
        System.out.println( );
        for(int k : arr){
            System.out.print(k + " ");
        }

   
    }
}
