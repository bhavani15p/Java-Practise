package StringsMethods;

public class contentEqualsMethod { // contentEquals() method searches a string to find out if it contains the exact
                                   // same sequence of character.

    public static void main(String[] args) {

        String word = "antifragile";
        System.out.println(word.contentEquals("agile"));  //false
        System.out.println(word.contentEquals("anti"));   //false
        System.out.println(word.contentEquals("antifragile")); //true

    }

}
