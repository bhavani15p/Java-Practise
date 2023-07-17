import java.util.*;
public class LinearSearch{

    public static int LinearSearch(int numbers[], int key) {
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }

        }
        return -1;
        
    }
    public static void main(String[] args) {
        int numbers[] = { 1, 6, 7, 56, 98, 45};
        int key =  56;
        int index =  LinearSearch(numbers, key);
        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Your is key at index: " + index);
        }
         
    }
}


/*
 
output:
-------

Your is key at index: 3


 */