import java.util.*;

public class LCM {

    public static int gcd(int a, int b) {
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

    public static int getLCM(int a, int b){
        int res = Math.max(a, b);

        while(true){
            if(res % a == 0 && res % b == 0){
                break;
            }
            res ++ ;
        }
        return res;
    }

    public static int getLCMEuclids(int a, int b){
        return (a * b) / gcd(a , b);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        int a = sc.nextInt();
        System.out.print("Enter value for b: ");
        int b = sc.nextInt();

        System.out.println(getLCM(a, b));
        System.out.println(getLCMEuclids(a, b));
        
    }
}