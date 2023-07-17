/*

Binary search!
 
Pseudo Code
-----------

start = 0, end = array length - 1

while(start <= end)

    find mid = (start + end) / 2
    
    compare mid & key
        mid == key (found)
        mid > key (1st end)
        mid < key (2nd end)

 */

import java.util.*;

public class BinarySearchwithStrings {

    public static int binarySearch(String flowers[], String key){
        int start = 0, end = flowers.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(flowers[mid] == key){
                return mid;
            }

            if(flowers[mid].compareTo(key) < 0){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String flowers[] = {"Rose", "Jasmine", "Lotus", "Lilly"};
        Arrays.sort(flowers);
        String key = "Lotus";
        System.out.println("index for " + key + "  is " + binarySearch(flowers, key));

    }
}

/*
 
output:
-------

index for Lotus  is 2


 */

