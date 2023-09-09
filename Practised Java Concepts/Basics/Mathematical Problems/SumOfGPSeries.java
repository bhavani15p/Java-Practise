public class SumOfGPSeries {

    public static int printGPSeries(int a, int r, int n) {
        int currTerm;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            currTerm = a * (int) Math.pow(r, i);
           sum += currTerm;
        }
        return sum;
    }

    public static void main(String[] args) {
        int a = 2;
        int r = 3;
        int n = 5;
        System.out.println(printGPSeries(a, r, n));
    }

}
