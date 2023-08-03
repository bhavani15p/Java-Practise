package StringsMethods;

public class codePointBeforeMethod {

    public static void main(String[] args) {

        String name = "Bhavani";
        int result = name.codePointBefore(4);//returns the Unicode of the character before the specified index. 
        System.out.println(result);
    }
    
}
