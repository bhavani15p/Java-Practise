import java.util.*;

public class Taking2DArrayInputs {

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        // for taking input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // for displaying output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
