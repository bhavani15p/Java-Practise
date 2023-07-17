import java.util.*;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter first integer (enter 0 to quit): ");
        int value = sc.nextInt();
        while(value!=0){
            sum = sum + value;
            System.out.print("Enter next integer (enter 0 to quit): ");
            value = sc.nextInt();
        }
        System.out.println("Sum of integers : " + sum);
    }
}
