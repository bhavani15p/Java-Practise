package ExceptionHandlingMethods;

public class FinallyBlock {
    public static void main(String[] args) {
        
        try{
            int num = Integer.parseInt("Bhavani");
            System.out.println(num);
        }
        finally{
            System.out.println("finally always executed");
        }
    }
    
}
