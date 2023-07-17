import java.util.*;
public class LinearSearchwithStrings{

    public static int LinearSearch(String Fruits[], String key) {
        for(int i = 0; i<Fruits.length; i++){
            if(Fruits[i] == key){
                return i;
            }

        }
        return -1;
        
    }
    public static void main(String[] args) {
        String Fruits[] = {"Mango", " Apple", "Orange", "Pineapple", "Pomogranut"};
        String key = "Orange";
        int index = LinearSearch(Fruits, key);
        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Your is key at index is " + index + " and your key length of " + key + " is " + key.length());
        }
         
    }
}

/*
 
output:
-------

Your is key at index is 2 and your key length of Orange is 6

 */