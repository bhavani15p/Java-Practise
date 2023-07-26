public class NumberFormatExceptionSample {
    public static void main(String[] args) {

        try{
            int num = Integer.parseInt("Bhavani");
            System.out.println(num);
        }
        catch(NumberFormatException e){
            System.out.println("Number Format Exception");
            
        }
        

    }
    
}
