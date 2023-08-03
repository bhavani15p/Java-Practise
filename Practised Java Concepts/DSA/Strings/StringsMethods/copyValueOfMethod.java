package StringsMethods;

public class copyValueOfMethod {  

    public static void main(String[] args) {

    //copyValueOf() method returns a string that represents the characters of the character array.

    char myName[] = {'b', 'h', 'a', 'v', 'a', 'n', 'i'}; 
    String name = "";
    name = name.copyValueOf(myName, 0, 7);
    System.out.println("Returned the name: " +  name);
        
    }
    
}
