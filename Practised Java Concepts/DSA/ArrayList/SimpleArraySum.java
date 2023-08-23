import java.util.ArrayList;
import java.util.List;

public class SimpleArraySum {

    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for (int i = 0; i < ar.size(); i++) {
            sum += ar.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

        int sum = simpleArraySum(array);

        System.out.println("Sum of the array: " + sum);
    }
}
