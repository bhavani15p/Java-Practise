import java.util.ArrayList;

public class MultiplicationTable {

     static ArrayList<Integer> getTable(int N) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            result.add(N * i);
        }
        return result;
    }
    public static void main(String[] args) {
        int num = 9;
        for(int i=1; i<=10; i++){
            System.out.println(num + " X " + i + " = " +  num * i );
        }
        

        //System.out.println(getTable(9));
    }
}