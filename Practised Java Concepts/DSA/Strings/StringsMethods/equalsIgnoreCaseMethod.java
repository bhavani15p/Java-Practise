package StringsMethods;
public class equalsIgnoreCaseMethod { //Compares the specified string to this string, ignoring case.
    public static void main(String[] args) {

        String name = "bhavani";
        String name2 = "BHAVANI";
        String otherName = "bavani";
        System.out.println(name.equalsIgnoreCase(name2)); //true
        System.out.println(name.equalsIgnoreCase(otherName)); //false
        

    }
    
}
