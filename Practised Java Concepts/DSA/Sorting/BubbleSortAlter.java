import java.util.*;

public class BubbleSortAlter {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        //run the steps n-1 times
        for(int i=0; i<n; i++){
            //for rach step, max item will come at the respective index
            for(int j=1; j<n-i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 3, 6, 1, 9, 2, 8 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        
    }
    
}

//  O(n^2)