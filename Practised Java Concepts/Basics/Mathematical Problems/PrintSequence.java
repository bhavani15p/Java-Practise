// Sequence: 1 1 2 1 2 3 1 2 3 4 1 2 3 4 5 1 2 3 4 5 6 1 2 3 4 5 6 7 1 2 3 4 5 6 7 8.....

public class PrintSequence {

    public static void printSequence(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
        }
    }
    public static int printSeqSum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
               sum += j;
            }
        }
        System.out.println();
        return sum;
    }
    public static void main(String[] args) {
        int n = 10;
        printSequence(n);
        System.out.println(printSeqSum(n));
    }
}
