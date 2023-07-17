/*
 
Max Subarray Sum using Kadane's Algorithm     
-----------------------------------------

+ve + +ve ---> +ve  ( ✔ ) 

Big +ve num + Small -ve num --> +ve num ( ✔ )

Small +ve num + Big -ve num --> -ve num ( ❌ ) i.e it gives a negative value - kadanes's algorithm does not 
consider negative value instead it consider neagative value as 0. 


          -2,   -3,   4,   -1,   -2,   1,   5,   -3

          ------------------------------------------

cur sum :  0     0    4     3     1    2    7     4          (if current sum is -ve , make it 0)

max sum :  0     0    4     4     4    4    7     7

 
Therefore maximum sub array is 7.


 */


import java.util.*;

public class MaxSubarraySumUsingKadanesAlgorithm {

    public static void maxSubarraySumUsingKadanesAlgorithm(int numbers[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for(int i=0; i<numbers.length; i++){
            currSum += numbers[i];

            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Maximum Sub Arrays Sum is  = " + maxSum);   
    }

    public static void main(String[] args) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        maxSubarraySumUsingKadanesAlgorithm(numbers); 
    }
    
}

//O(n)

/*
 
output:
-------

Maximum Sub Arrays Sum is  = 7


 */