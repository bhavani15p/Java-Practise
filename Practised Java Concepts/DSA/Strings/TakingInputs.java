import java.util.*;

public class TakingInputs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String name = sc.next(); // next() method reads only the first word from the input stream
        System.out.println(name);

        /*
        System.out.print("Enter the message: ");
        String message = sc.nextLine(); // nextLine() method reads the entire line of input, terminates when new line encountered.
        System.out.println(message);

         */

       


    }
    
}
