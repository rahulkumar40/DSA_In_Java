package Array_15;

public class NextGreatestElement {
    static void nextLargest(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        ans[n-1] = -1;
        int max = Integer.MIN_VALUE;
        for ( int j = n-2; j >= 0; j--) {
            ans[j] = max;
            if(arr[j] > max){
                max = arr[j];
            }
        }
        System.out.println( );
        for(int k : ans){
            System.out.print(k + " ");
        }
        System.out.println( );
    }
    public static void main(String[] args) {
        int arr[] = {12, 8, 41, 37, 2, 49, 16, 28, 21};
        int n = arr.length; 

        int ans[] = new int[arr.length];

        nextLargest(arr);
        for(int k : arr){
            System.out.print(k + " ");
        }
        ans[n-1] = -1;
        for (int i=0; i < arr.length-1; i++) {
        int max = Integer.MIN_VALUE;
            for ( int j = i+1; j < arr.length; j++) {
                if(arr[j] > max){
                    max = arr[j];
                }
            }
            ans[i] = max;
        }
        System.out.println( );
        for(int k : ans){
            System.out.print(k + " ");
        }
    }
}
