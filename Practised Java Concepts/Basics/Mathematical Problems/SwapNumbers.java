import java.util.*;

public class SwapNumbers {

    public static void swapUsingTemp(int value1, int value2) {

        int temp = value1;
        value1 = value2;
        value2 = temp;

        System.out.println(value1 + " " + value2);

    }

    public static void swapWithoutUsingTemp(int value1, int value2) {
        value1 = value1 - value2;
        value2 = value1 + value2;
        value1 = value2 - value1;

        System.out.println(value1 + " " + value2);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        int a = sc.nextInt();
        System.out.print("Enter value for b: ");
        int b = sc.nextInt();

        swapUsingTemp(a, b);
        swapWithoutUsingTemp(a, b);

    }

}
