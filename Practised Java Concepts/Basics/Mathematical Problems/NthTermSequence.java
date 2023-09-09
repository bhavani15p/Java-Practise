/*

Sequence : 1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, ... 

In this sequence first we have the number 1, 
then the numbers from 1 to 2, 
then the numbers from 1 to 3 and so on. 

find the N'th number in this sequence.

Example 1:

Input: N = 4
Output: 1
Explanation: 4'th number is 1. 

*/

public class NthTermSequence {
    
    public static long getNthTerm(long n){
       long currNum = 1; 
       long maxNum  = 1;  
       
        while (n > maxNum) {
            currNum++;
            maxNum += currNum;
        }
        
        long nthTerm = n - (maxNum - currNum);

        return nthTerm;

    }
    public static void main(String[] args) {
        long n = 10;
       long result = getNthTerm(n);
        System.out.println(result);
    }
}
