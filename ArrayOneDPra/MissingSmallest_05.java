// wap to find the smallest missing positive element in the sorted array ( take the array as input )
package ArrayOneDPra;

public class MissingSmallest_05 {
    static void s(int arr[]){
        int n = arr.length; 
        int count = 0, i;
        for(i=0; i<n; i++){
            if(arr[i] != i){
                count = i;
                break;
            }
        }
        System.out.println(count + " ");
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 6, 7,8};

        int mx = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }

        s(arr);
        int a[] = new int[mx + 1];

        for(int i=0; i<arr.length; i++){
            a[arr[i]]++;
        }

        // int min = 
        for(int i=0; i<=mx; i++){
            System.out.print(a[i] + " ");
        }
    }
}
