public class SeriesAP {

    static int nthTermOfAP(int A1, int A2, int N) {
       int commonDifference = A2 - A1;
        int nthTerm = A1 + (N - 1) * commonDifference;
        return nthTerm; 
    }
    
    static void printAPSeries(int A1, int A2, int N) {
        int commonDifference = A2 - A1;
        int currentTerm = A1;
        
        for (int i = 0; i < N; i++) {
            System.out.print(currentTerm + " ");
            currentTerm += commonDifference;
        }
    }
    public static void main(String args[]) {
        int A1 = 2;
        int A2 = 3;
        int N = 4;

        int result = nthTermOfAP(A1, A2, N);

        System.out.println(result);
        printAPSeries(A1, A2, N);

    }
}
