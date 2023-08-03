package StringsMethods;

public class replaceMethod { //replace all oocurence of substring with another substring

    public static void main(String[] args) {
        
        String name = "bharath";
        String myName = "bhavani";
        name = name.replace(name, myName);

        System.out.println(name);

        String myStr = "Kalpana";
        System.out.println(myStr.replace("lp", "v"));
    }
    
}
