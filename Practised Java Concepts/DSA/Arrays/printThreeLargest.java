import java.util.*;

public class printThreeLargest {

    public static void print3Largest(int[] num, int size) {
        if (size < 3) {
            System.out.println("Invalid Input");
            return;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (num[i] > first) {
                third = second;
                second = first;
                first = num[i];
            } else if (num[i] > second) {
                third = second;
                second = num[i];
            } else if (num[i] > third) {
                third = num[i];
            }
        }

        System.out.println("Three largest elements are " + first + " " + second + " " + third);
    }

    public static void main(String[] args) {
        int[] num = {21, 78, 34, 42, 98, 76, 77};
        print3Largest(num, num.length);
    }
}
