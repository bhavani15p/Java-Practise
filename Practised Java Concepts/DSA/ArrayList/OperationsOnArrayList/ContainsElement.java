package OperationsOnArrayList;
import java.util.ArrayList;

public class ContainsElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // contains
        System.out.println(list.contains(2));
        System.out.println(list.contains(11));

    }

}

// O(n)
