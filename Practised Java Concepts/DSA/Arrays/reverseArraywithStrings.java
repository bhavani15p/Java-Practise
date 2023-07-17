import java.util.*;

public class reverseArraywithStrings {

    public static void reverseArray(String flowers[]) {

        int first = 0, last = flowers.length - 1;

        while (first < last) {
            String temp = flowers[first];
            flowers[first] = flowers[last];
            flowers[last] = temp;

            first++;
            last--;

        }
    }

    public static void main(String[] args) {

        String flowers[] = { "Rose", "Jasmine", "Lotus", "Lilly" };
        reverseArray(flowers);
        for (int i = 0; i < flowers.length; i++) {
            System.out.print(flowers[i] + " ");
        }
        System.out.println();

    }
}

/*
 
output:
-------

Lilly Lotus Jasmine Rose


 */