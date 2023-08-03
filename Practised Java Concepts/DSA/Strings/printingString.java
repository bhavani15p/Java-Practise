import java.util.*;

public class printingString {


    public static void printString(String name){
        for(int i=0; i<name.length(); i++){
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name:");
        String name = sc.nextLine();
        printString(name);
        
        


    }
    
}
