import java.util.*;

public class OddEven {
    public static void OddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            // even number
            System.out.println(n + " is even number");
        } else {
            System.out.println(n + " is odd number");
        }
    }

    public static void main(String[] args) {
        OddOrEven(7);
        OddOrEven(1);
        OddOrEven(4);
    }
}

/*

 
Output:
-------
7 is odd number
1 is odd number
4 is even number


 */