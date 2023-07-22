import java.util.*;

public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
     public static void bubbleSortOptimized(int arr[]) { //All though this optimization doesn't change worst-case - O(n^2)
        int n = arr.length;
        boolean swapped;

        for(int i=0; i<n-1; i++){
            swapped = false;

            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;

                }
            }
            if(!swapped){
                break;
            }
        }
     }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 1, 9, 2, 8 };
        bubbleSort(arr);
        bubbleSortOptimized(arr);
        printArray(arr);

    }
}


//  O(n^2)

