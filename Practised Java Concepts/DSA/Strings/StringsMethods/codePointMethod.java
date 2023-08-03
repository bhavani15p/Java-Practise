package StringsMethods;

public class codePointMethod {

    public static void main(String[] args) {
        
        String name = "Bhavani";
        int result = name.codePointAt(4); //returns the Unicode of the first character in a string (eg. Unicode value of "H" is 72, "h" is 104)
        System.out.println(result);
    }
    
}
