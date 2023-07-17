public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calci = new Calculator();
        System.out.println(calci.sum(1,9,8));
        System.out.println(calci.sum(4.5f, 2.5f));
        System.out.println(calci.sum(8,8));
        
    }
    
}
class Calculator{
    int sum(int a, int b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }

     int sum(int a, int b, int c){
        return a + b + c;
    }

}
