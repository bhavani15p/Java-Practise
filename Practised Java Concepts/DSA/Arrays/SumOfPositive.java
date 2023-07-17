/*
 
Q. Sum of positive

You get an array of numbers, return the sum of all of the positives ones.

Example [1,-4,7,12] => 1 + 7 + 12 = 20

Note: if there is nothing to sum, the sum is default to 0.

 */

public class SumOfPositive {

  public static int sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0) {
        sum += arr[i];
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, -4, 5, 6, 7};
    int sum = sum(numbers);
    System.out.println("The sum of all the positive numbers is " + sum);
  }
}