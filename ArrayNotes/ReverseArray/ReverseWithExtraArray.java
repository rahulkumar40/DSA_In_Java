package ReverseArray;
/**
 * ReverseWithExtraArray
 */
public class ReverseWithExtraArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int n = arr.length; 
        int newA[] = new int[n];
        int i=0, j = n-1;
        while (i<n) {
            newA[j--] = arr[i++];
        }
        for(int k : newA){
            System.out.println(k + " ");
        }
        // for(int m=0; m<arr.length; m++){
        //     newA[j] = arr[m];
        //     j--;
        // }
        // for(int kk : newA) System.out.print(kk + " ");
    }
}