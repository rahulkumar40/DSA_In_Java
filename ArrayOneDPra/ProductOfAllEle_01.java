// calculate the product of all the elements in the given array. 

package ArrayOneDPra;

public class ProductOfAllEle_01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 9, 11};
        int ans = 1;
        for(int i=0; i<arr.length; i++){
            ans *= arr[i];
        }
        System.out.println("Product of Array's Element : "+ ans);
    }
}
