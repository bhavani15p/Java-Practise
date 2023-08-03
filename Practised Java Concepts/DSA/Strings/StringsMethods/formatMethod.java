package StringsMethods;

public class formatMethod {

    public static void main(String[] args) {
        
        String word = "Morning";

        String formattedStr = word.format("Good %s", word);
        System.out.println(formattedStr);
    }
    
}
