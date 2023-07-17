
// prefix[end] - prefix [start - 1]

// prefix[i-1] + arr[i]

import java.util.*;

public class MaxSubarrayPrefixSum{

    public static void maxSubArrayPrefixSum(int numbers[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] =  new int[numbers.length];

        prefix[0] = numbers[0];

        //calculate prefix array
        for(int i=1; i<numbers.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sub Arrays Sum is  = " + maxSum);   
    }
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        maxSubArrayPrefixSum(numbers); 
    }
}

// O(n^2) < O(n^3)

/*
 
output:
-------

Maximum Sub Arrays Sum is  = 30


 */