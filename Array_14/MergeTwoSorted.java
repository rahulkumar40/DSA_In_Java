package Array_14;

class MergeTwoSorted{
    public static void main(String[] args) {
        int first[] = {1, 3, 4, 6, 8};
        int second[] = {3, 5, 6, 9, 10};
        
        // size of firsArray + secodArray = 
        int a = first.length, b = second.length; 

        int ans[] = new int[a+b]; 
        int j =0, i = 0, k=0;
        while (i<a && j<b) {
            if(first[i] <= second[j]){
                ans[k] = first[i];
                i++;
                k++;
            }
            else {
                ans[k] = second[j];
                j++;
                k++;
            }
        }
        if(i == a){
            while (j < b) {
                ans[k] = second[j];
                k++;
                j++;
            }
        }
        if(j == b){
            while (i < a) {
                ans[k] = first[i];
                k++;
                i++;
            }
        }
        for(int m : ans){
            System.out.print(m + " ");
        }
    }
}