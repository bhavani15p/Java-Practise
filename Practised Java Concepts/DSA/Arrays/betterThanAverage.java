/*

Q. How good are you really?

There was a test in your class and you passed it. Congratulations!
But you're an ambitious person. You want to know if you're better than the average student in your class.

You receive an array with your peers' test scores. Now calculate the average and compare your score!

Return True if you're better, else False!

Note:
Your points are not included in the array of your class's points. For calculating the average point you may add your point to the given array!

 */

public class betterThanAverage {

  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    int averageScore = 0;
    for (int i = 0; i < classPoints.length; i++) {
      averageScore += classPoints[i];
    }
    averageScore /= classPoints.length;
    return yourPoints > averageScore;
  }

  public static void main(String[] args) {
    int[] scores = {10, 5, 8, 12};
    int yourScore = 14;
    boolean better = betterThanAverage(scores, yourScore);
    System.out.println(better); 
  }
}


