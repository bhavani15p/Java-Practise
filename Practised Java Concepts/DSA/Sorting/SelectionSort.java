import java.util.*;

public class SelectionSort {

    public static void selectionSort(int arr[]) {
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            int minPos = i;
            for(int j=i+1; j<n; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            swap(arr, minPos, i);

        }
    }

    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] =arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 1, 9, 2, 8 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    
}
//  O(n^2)