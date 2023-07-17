import java.util.*;

public class ArrayCreation {
    public static void main(String[] args) {

        int marks[] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Physics marks : ");
        marks[0] = sc.nextInt();

        System.out.print("Enter your Chemistry marks : ");
        marks[1] = sc.nextInt();

        System.out.print("Enter your Maths marks : ");
        marks[2] = sc.nextInt();

        System.out.println("-------------------------------");

        System.out.println("Physics : " + marks[0]);
        System.out.println("Chemistry : " + marks[1]);
        System.out.println("Maths : " + marks[2]);

    }
}


/*

Output:

Enter your Physics marks : 56
Enter your Chemistry marks : 78
Enter your Maths marks : 89
-------------------------------
Physics : 56
Chemistry : 78
Maths : 89


 */