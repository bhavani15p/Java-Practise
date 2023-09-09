public class SumOfAP {

    public static int sumOfAP(int n, int a, int d) {
        // Calculate the sum using the formula
        int sum = (n * (2 * a + (n - 1) * d)) / 2;
        return sum;
    }
    
    public static void main(String[] args) {
        int n = 5; // Number of terms
        int a = 1; // First term
        int d = 3; // Common difference
        
        int sum = sumOfAP(n, a, d);
        System.out.println("The sum of the series up to the " + n + "th term is: " + sum);
    }
    
}
