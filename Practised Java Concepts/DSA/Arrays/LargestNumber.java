import java.util.*;

public class LargestNumber {

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // - infinity value
        int smallest = Integer.MAX_VALUE; // + infinity value
        for(int i = 0; i<numbers.length; i++){
            if(largest < numbers[i]){ // if numbers is greater than MIN_VALUE
                largest = numbers[i];
            }
            if(smallest > numbers[i]){ // if numbers is less than MAX_VALUE
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is : " + smallest);
        return largest;
    }


    public static void main(String[] args) {
        int numbers[] = {-6, 0, 7, 56, 98, 45};
        System.out.println("largest value is : " + getLargest(numbers));
        
    }
    
}

/*
 
output:
-------

Smallest value is : -6
largest value is : 98

 */