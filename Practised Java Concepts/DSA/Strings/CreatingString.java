/*

    --> Strings are the type of objects that can store the sequence of character of values.

    --> "java.lang.String" class is used to create a string object.

    --> Strings are immutable, which means that once they're created, their values cannot be changed.

    --> Strings are stored in the heap, which is a part of the memory that is managed by the JVM.
 */


public class CreatingString {

    public static void main(String[] args) {
        
        String name = "Bhavani Puttaraj";  //using string literal
        String name1 = new String(name);   //using new keyword

        //array of characters works same as Java String
        char ch[] = {'b', 'h', 'a', 'v', 'a', 'n', 'i'}; // same as String myName = "bhavani";
        String myName = new String(ch);

        System.out.print(name1 + ", aka: " + myName);




    }
    
}
