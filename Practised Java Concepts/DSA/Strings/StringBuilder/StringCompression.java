package StringBuilder;

public class StringCompression {

    public static void main(String[] args) {

        // Define the string to be compressed
        String str = "aaaabbccdde";

        // Create a StringBuilder to store the compressed string
        StringBuilder compressedStr = new StringBuilder();

        // Iterate through the string
        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            // Check if the current character is the same as the next character
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            // Append the character and its count to the compressed string
            compressedStr.append(str.charAt(i));
            if (count > 1) {
                compressedStr.append(count);
            }
        }

        // Print the compressed string
        System.out.println("The compressed string is: " + compressedStr.toString());
    }
}
