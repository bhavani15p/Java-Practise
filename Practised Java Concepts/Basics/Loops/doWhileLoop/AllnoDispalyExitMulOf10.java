import java.util.*;

public class AllnoDispalyExitMulOf10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter your number : ");
            int input = sc.nextInt();
            if (input % 10 == 0) {
                break;
            }
            System.out.println("number was : " + input);
        } while (true);

    }
}
