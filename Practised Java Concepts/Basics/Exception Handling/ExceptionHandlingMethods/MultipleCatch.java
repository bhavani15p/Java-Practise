package ExceptionHandlingMethods;

public class MultipleCatch {
    public static void main(String[] args) {
        try{
            int a = 30;
            int b = 0;
            int c = a / b;
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occurs");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception occurs");
        }catch(Exception e){
            System.out.println("Other Exception occurs");
        }
        System.out.println();
        
    }
    
    
}
