package ArrayOneDPra;

public class TriplateSum_09 {
    public static void main(String[] args) {
        int arr[] = {4, 5, 7, 3, 8, 2, 0, 3, 1};
        int n = arr.length; 
        int x = 11;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if((arr[i] + arr[j] + arr[k]) == x)
                    {
                        System.out.print(i + " " + j + " " + k + "      ");
                        break;
                    }
                }
            }
        }
    }
}
