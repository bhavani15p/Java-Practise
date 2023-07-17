import java.util.*;

public class MaxSubarraySum{

    public static void maxSubArraySum(int numbers[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;


        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum = 0;
                for(int k = start; k<=end; k++){
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sub Arrays Sum is  = " + maxSum);   
    }
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        maxSubArraySum(numbers);
        
    }
}

// O(n^3)

/*
 
output:
-------

2
6
12
20
30
4
10
18
28
6
14
24
8
18
10
Maximum Sub Arrays Sum is  = 30


 */