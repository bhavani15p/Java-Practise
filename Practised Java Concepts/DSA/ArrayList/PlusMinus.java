import java.util.*;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        int n = arr.size();
        double positiveCount = 0;
        double negativeCount = 0;
        double zeroCount = 0;

        for (int i = 0; i < n; i++) {
            int element = arr.get(i);
            if (element > 0) {
                positiveCount++;
            } else if (element < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        double positiveRatio = positiveCount / n;
        double negativeRatio = negativeCount / n;
        double zeroRatio = zeroCount / n;

        System.out.printf("%.6f%n", positiveRatio);
        System.out.printf("%.6f%n", negativeRatio);
        System.out.printf("%.6f%n", zeroRatio);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        plusMinus(arr);
    }

}
