public class FindNthTermAP { //1, 3, 6, 10, 15, 21

    public static int findNthTerm(int n) {
        // Calculate the nth term using the formula (n * (n + 1)) / 2
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        int n = 6; // Replace with the desired value of n

        int nthTerm = findNthTerm(n);
        System.out.println("The " + n + "-th term of the series is: " + nthTerm);
    }
}
