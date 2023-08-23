import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size();
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;
    
        for (int i = 0; i < n; i++) {
            leftDiagonalSum += arr.get(i).get(i);
            rightDiagonalSum += arr.get(i).get(n - 1 - i);
        }
    
        int difference = Math.abs(leftDiagonalSum - rightDiagonalSum);
        return difference;
    }

    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();

        matrix.add(new ArrayList<>());
        matrix.get(0).add(1);
        matrix.get(0).add(2);
        matrix.get(0).add(3);

        matrix.add(new ArrayList<>());
        matrix.get(1).add(4);
        matrix.get(1).add(5);
        matrix.get(1).add(6);

        matrix.add(new ArrayList<>());
        matrix.get(2).add(7);
        matrix.get(2).add(8);
        matrix.get(2).add(9);

        // matrix.add(new ArrayList<>(List.of(1, 2, 3)));
        // matrix.add(new ArrayList<>(List.of(4, 5, 6)));
        // matrix.add(new ArrayList<>(List.of(7, 8, 9)));

        int result = diagonalDifference(matrix);
        System.out.println("Absolute Diagonal Difference: " + result);
    }
}

/*

First Iteration (i = 0):

arr.get(0).get(0) gets the element at row 0 and column 0, which is 11. This is added to the leftDiagonalSum.
arr.get(0).get(n - 1 - 0) gets the element at row 0 and column 2 (since n - 1 - 0 is 2), which is 4. This is added to the rightDiagonalSum.

Second Iteration (i = 1):

arr.get(1).get(1) gets the element at row 1 and column 1, which is 5. This is added to the leftDiagonalSum.
arr.get(1).get(n - 1 - 1) gets the element at row 1 and column 1 (since n - 1 - 1 is 1), which is 5. This is added to the rightDiagonalSum.

Third Iteration (i = 2):

arr.get(2).get(2) gets the element at row 2 and column 2, which is -12. This is added to the leftDiagonalSum.
arr.get(2).get(n - 1 - 2) gets the element at row 2 and column 0 (since n - 1 - 2 is 0), which is 10. This is added to the rightDiagonalSum.
After the loop completes, you have the sums of the left diagonal and the right diagonal.

Then, the absolute difference between these sums is calculated using Math.abs(leftDiagonalSum - rightDiagonalSum).

This loop allows the code to work for matrices of any square size by iterating through the diagonal elements and summing them accordingly.
 */
