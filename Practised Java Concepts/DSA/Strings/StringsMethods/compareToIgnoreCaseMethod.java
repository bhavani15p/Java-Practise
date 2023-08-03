package StringsMethods;

public class compareToIgnoreCaseMethod {

    public static void main(String[] args) {
        
        String name = "bhavani";
        String name2 = "BHAVANI";
        System.out.println(name.compareToIgnoreCase(name2)); //compareToIgnoreCase() methods compare two strings ignoring their cases(Upper case or lower case)
    }
    
}
