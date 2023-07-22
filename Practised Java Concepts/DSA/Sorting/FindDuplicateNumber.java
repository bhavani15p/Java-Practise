import java.util.*;

public class FindDuplicateNumber{


    public static int duplicateNumbers(int arr[]){
        int i=0;
        int n=arr.length;
        while( i < n){
            if(arr[i] != i+1){
                int correct = arr[i] - 1;
                if(arr[i] != arr[correct]){
                    swap(arr, i, correct);
                }else{
                    return arr[i];
                }
            }else{
                i++;
            }    
    }
    return -1;
}
    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] =arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 3, 2};
        System.out.println(duplicateNumbers(arr));
        
    }
}