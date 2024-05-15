package ReverAtKthPosion;

public class WithExtraArray {
    static void rotateAtK(int arr[], int k){
        int n = arr.length;
        k = k % n;
        int j=0; 

        int ans[] = new int[n];
        for(int i= n-k; i<n; i++){
            ans[j++] = arr[i];
        }
        for(int i=0; i<n-k; i++){
            ans[j++] = arr[i];
        }

        for(int i : ans){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        rotateAtK(arr, 3);

    }
}
