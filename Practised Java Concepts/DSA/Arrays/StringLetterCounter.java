/*
Q. Create a function that accepts a string and a single character, and returns an integer of the count of occurrences the 2nd argument is found in the first one.

If no occurrences can be found, a count of 0 should be returned.

("Hello", "o")  ==>  1
("Hello", "l")  ==>  2
("", "z")       ==>  0

str_count("Hello", 'o'); // returns 1
str_count("Hello", 'l'); // return


Notes
The first argument can be an empty string
In languages with no distinct character data type, the second argument will be a string of length 1

 */

 public class StringLetterCounter {

    public static int strCount(String str, char letter) {
      int count = 0;
      for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == letter) {
          count++;
        }
      }
      return count;
    }
  
    public static void main(String[] args) {
      System.out.println(strCount("Hello", 'o')); 
      System.out.println(strCount("Hello", 'l')); 
      System.out.println(strCount("", 'z'));
    }
  }
  