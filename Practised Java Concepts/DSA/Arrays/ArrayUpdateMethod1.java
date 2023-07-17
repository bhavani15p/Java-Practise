import java.util.*;

public class ArrayUpdateMethod1 {
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
        
        System.out.println("-------------------------------");

        marks[2] = 78;
        System.out.println("Updated Maths Marks : " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage = " + percentage + " % ");

    }
}

/*

Output :

Enter your Physics marks : 56
Enter your Chemistry marks : 67
Enter your Maths marks : 76
-------------------------------
Physics : 56
Chemistry : 67
Maths : 76
-------------------------------
Updated Maths Marks : 78
Percentage = 67 %


 */