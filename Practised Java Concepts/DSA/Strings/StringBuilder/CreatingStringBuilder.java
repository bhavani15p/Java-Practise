package StringBuilder;

public class CreatingStringBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("");

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            sb.append(ch + " ");
        }
        System.out.print(sb);

    }

}
// O(26 * n^2)