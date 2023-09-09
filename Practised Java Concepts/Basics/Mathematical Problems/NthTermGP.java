import java.util.Scanner;

public class NthTermGP {

    public static int MOD = 1000000007;
    public static int Nth_term(int a, int r, int n) {
        
        long x = (long) a * power(r, n - 1) % MOD; // Calculate a * r^(n-1) modulo MOD
        return (int) x;
    }
    public static int Nthterm(int a, int r, int n) {
        
        int x =  a * (int)Math.pow(r, n - 1) % MOD; // Calculate a * r^(n-1) modulo MOD
        return x;
    }

    public static long power(int r, int n) {
        if (n == 0) {
            return 1;
        }
        long t = power(r, n / 2) % MOD;
        t = (t * t) % MOD;
        if (n % 2 == 0) {
            return t % MOD;
        }
        return (r * t) % MOD;
    }
   
    public static int calculateNthTerm(int a, int r, int n) {
        if (n == 1) {
            return a;
        }
        int nthTerm = a * (int)Math.pow(r, n - 1);
        
        return nthTerm;
    }

    public static void main(String[] args) {
        int a = 2;
        int r = 3;
        int n = 3;
        //System.out.println(calculateNthTerm(a, r, n));
        // int result = Nth_term(a, r, n);
        // System.out.println("The Nth term of the GP series is: " + result);
        System.out.println(Nthterm(a,r,n));
    }
    
}
