import java.util.*;

public class FindDisappearedNumbers{

    public static List<Integer>findDisappearedNumbers(int arr[]){
        List<Integer> ans = new ArrayList<>();
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

        //just find missing numbers
        
        for(int index=0; index < arr.length; index++){
            if(arr[index] != index+1){
                ans.add(index + 1);

            }
        }

        //case 2
        return ans;

    }

    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] =arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args){
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> ans = findDisappearedNumbers(arr);
        System.out.println("The disappeared numbers are: " + ans);
    }
}

