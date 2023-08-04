package OperationsOnArrayList;
import java.util.ArrayList;

public class AddElement {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1, 4);

        System.out.println(list);
    }
}

// O(n)