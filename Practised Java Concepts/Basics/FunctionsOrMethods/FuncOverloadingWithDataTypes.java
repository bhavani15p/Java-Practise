public class FuncOverloadingWithDataTypes {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b, float c) {
        return a + b + c;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(2.5f, 10.1f, 20.3f));
        System.out.println(sum(4, 5));
        System.out.println(sum(34.12, 9.12));

    }

}
