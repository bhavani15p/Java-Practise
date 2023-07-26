public class ClassNotFoundExceptionExample{

    public static void main(String[] args) {
        
        try{
            Class.forName("Bhavani");
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
            System.out.println("Class Not Found . . .");
        }
    }

}