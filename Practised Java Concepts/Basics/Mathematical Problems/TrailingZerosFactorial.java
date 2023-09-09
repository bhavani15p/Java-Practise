public class TrailingZerosFactorial {

    public static int trailingZeros(int n){
        int powOf5 = 5;
        int res = 0;

        while(n >= powOf5){
            res = res + (n/powOf5);
            powOf5 = powOf5 * 5;
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 20;
        System.out.println(trailingZeros(n));
    }
}
