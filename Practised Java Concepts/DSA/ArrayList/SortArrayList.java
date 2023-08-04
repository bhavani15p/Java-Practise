import java.util.*;

// import java.util.ArrayList;
// import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println("Before Sorting ArrayList: " + list);
        Collections.sort(list);
        System.out.println("Sorting ArrayList in Ascending order: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorting ArrayList in Descending order: " + list);
    }

}
