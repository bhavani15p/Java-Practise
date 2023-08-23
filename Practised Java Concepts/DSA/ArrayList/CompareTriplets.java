import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alice = 0;
        int bob = 0;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                alice++;
            } else if (a.get(i) < b.get(i)) {
                bob++;
            }
        }

        result.add(alice);
        result.add(bob);
        return result;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        a.add(5);
        a.add(6);
        a.add(7);

        b.add(3);
        b.add(6);
        b.add(10);

        List<Integer> comparisonResult = compareTriplets(a, b);
        System.out.println("Alice's score: " + comparisonResult.get(0));
        System.out.println("Bob's score: " + comparisonResult.get(1));
    }
}
