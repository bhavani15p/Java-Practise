package StringsMethods;

public class containsMethod {

    public static void main(String[] args) {
        
        String myString = "beautiful";

        // contains() Method checks weather a string contains a sequence of characters
        System.out.println(myString.contains("ful")); //true
        System.out.println(myString.contains("beauti")); //true
        System.out.println(myString.contains("auti")); //true
        System.out.println(myString.contains("ant")); //false
    }
    
}
