public class FastExponentiation {
    public static int fastExponentiation(int a, int n) {

        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) { // check LSB

                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;

    }

    public static int fastModularExponentiation(int a, int n, int p) { //O(log2n)

        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) { // check LSB

                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans % p;

    }

    public static void main(String[] args) {

        System.out.println(fastExponentiation(2, 4));
        System.out.println(fastModularExponentiation(2, 5, 13));
    }
}

/*

 
Output:
-------
16
6


 */


