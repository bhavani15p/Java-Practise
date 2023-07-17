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

public class BinarySearch {
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            // comparision
            if (numbers[mid] == key) {
                return mid;
            } else if (numbers[mid] < key) {// right
                start = mid + 1;
            } else {// left
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 67, 89 };
        int key = 8;
        System.out.println("index is found at : " + binarySearch(numbers, key));

    }

}
/*
 
output:
-------

index is found at : 3


 */