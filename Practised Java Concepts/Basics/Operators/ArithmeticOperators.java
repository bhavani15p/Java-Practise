import java.util.*;

public class ArithmeticOperators{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value for b: ");
        int b = sc.nextInt();
        System.out.println( "Addidition of " + a + " and " + b + " is "  + (a + b));
        System.out.println( "Subtraction of " + a + " and " + b + " is "  + (a - b));
        System.out.println( "Multiplication of " + a + " and " + b + " is "  + (a * b));
        System.out.println( "Division of " + a + " and " + b + " is "  +   (a / b));
        System.out.println( "Modulo(Remainder) of " + a + " and " + b + " is "  + (a % b));
    }
}