public class Swap{

    public static void Swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a" + " = " + a + "," + "b" + " = " + b);
    }
    public static void main(String[] args) {

        Swap(5,7);
        
    }
}