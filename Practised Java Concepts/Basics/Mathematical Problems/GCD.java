import java.util.Scanner;
public class GCD {

     public static void getGcd(int a, int b) {
        int min = 0;

        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }

    public static int getEuclidsGcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static int Opti_EuclidsGCD_Gabriel(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a != 0) {
            return a;
        } else {
            return b;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        int a = sc.nextInt();
        System.out.print("Enter value for b: ");
        int b = sc.nextInt();

        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> System.out.println(Opti_EuclidsGCD_Gabriel(a, b));
            case 2 -> System.out.println(getEuclidsGcd(a, b));
            case 3 -> getGcd(a, b);
        }
        

    }
}
