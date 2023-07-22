import java.util.*;

public class CyclicSort{

    public static void cyclicSort(int arr[]) {
        int i=0;
        int n=arr.length;
        while( i < n){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
        
    }

    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] =arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {

        int arr[] = {3, 5, 2, 1, 4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

        
    }
}