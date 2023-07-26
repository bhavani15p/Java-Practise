package ExceptionHandlingMethods;

public class Nestedtry {
    public static void main(String[] args) {
        
        try{
            try{
                int num = Integer.parseInt("Bhavani");
                System.out.println(num);
            }
            catch(NumberFormatException e){
                System.out.println("Number Format Exception");
            }
             try{
                int arr[] = new int[5];
                arr[6] = 0;
             }
             catch(Exception e){
                System.out.println("Handled");
             }
             System.out.println("other statement");
        }
        catch(Exception e){
            System.out.println("handled and recovered");
        }
    }
    
}
