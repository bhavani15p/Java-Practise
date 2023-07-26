import java.util.*;

public class IOExceptionExample{
    public static void main(String[] args) {
        Scanner sc = new Scanner("Hello Bhavani!");
        System.out.println(sc.nextLine());
        System.out.println("Exception Output: " + sc.ioException());
        sc.close();
    }
}