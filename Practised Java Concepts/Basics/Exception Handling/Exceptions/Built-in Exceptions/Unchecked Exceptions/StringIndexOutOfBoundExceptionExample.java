public class StringIndexOutOfBoundExceptionExample {
    public static void main(String[] args) {
        try {
            String a = "This is Bhavani ";
            char c = a.charAt(27); 
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("String Index Out Of Bounds Exception . . .");
        }
    }
}
