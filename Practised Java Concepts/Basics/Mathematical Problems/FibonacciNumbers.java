public class FibonacciNumbers {

    public static void main(String[] args) {
        
        int num = 5;

        int first = 0;
        int second = 1; 
        System.out.print(first + " " + second + " ");

        for(int i=0; i<=num; i++){
            int third = first + second;
            first = second;
            second = third;
            System.out.print(third + " ");
        }

    }
    
}
