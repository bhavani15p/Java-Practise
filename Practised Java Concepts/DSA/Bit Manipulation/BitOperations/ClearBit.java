package BitOperations;

public class ClearBit {

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;

    }

    public static int clearLastIthBit(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;

    }

    public static int clearRangeOfBits(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;

    }

    public static void main(String[] args) {
        System.out.println(clearIthBit(10, 1));
        System.out.println(clearLastIthBit(15, 2));
        System.out.println(clearRangeOfBits(10, 2, 4));
    }

}

/*

 
Output:
-------
8
12
2


 */

