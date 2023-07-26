public class IllegalStateExceptionExample {

    public static void main(String[] args) {
        int age = 12;
        if(age >= 18){
            System.out.println("You're eligible for voting!");
        }else{
            throw new IllegalStateException("Sorry, you're not eligible for voting!");
        }
    }
    
}
