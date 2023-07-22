/*


Q. Numbers from 0 till N => Total will be N + 1 numbers

Ex. N=4, arr = [4, 0, 2, 1]


*/

import java.util.Arrays;

public class MissingNumber {

    public static int missingNumber(int arr[]) {
        int i=0;
        int n=arr.length;
        while( i < n){
            int correct = arr[i];
            if(arr[i] < n && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }

        //search for first missing number
        for(int index=0; index<n; index++){
            if(arr[index] != index){
                return index;
            }
        }

        //case 2
        return n;


        
    }

    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] =arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {

        int arr[] = {1, 0, 2, 3, 5, 6};
        System.out.println(missingNumber(arr));

        
    }
}
