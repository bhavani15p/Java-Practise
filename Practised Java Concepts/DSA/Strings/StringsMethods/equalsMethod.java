package StringsMethods;
public class equalsMethod { //compare specified string to another string, checks both are equal exactly

    public static void main(String[] args) {
        
        String name = "bhavani";
        String name2 = "BHAVANI";
        String name3 = name;
        System.out.println(name.equals(name2)); //false
        System.out.println(name.equals(name)); //true


    }
    
}
