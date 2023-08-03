package StringsMethods.Strings;

public class codePointCountMethod {

    public static void main(String[] args) {
        
        String name = "Bhavani";
        int result = name.codePointCount(2, 5); //codePointCount() Method returns the no. of Unicode values found in a string.
        System.out.println(result);
    }
    
}
