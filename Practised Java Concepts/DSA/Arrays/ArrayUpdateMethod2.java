/* 
   Problem: 

   Write a program that prompts the studnts(user) to enter the number of subjects and the original marks for
   each subject. The program should then calculate the final maks by adding +2 grace marks to each subject.
   Finally, it should display the updated +2 marks. (Use only Arrays)

 */

import java.util.*;

public class ArrayUpdateMethod2 {

    //for updating marks by +2
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 2;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of subjects : ");
        int size = sc.nextInt();

        //creating new array
        int marks[] = new int[size];
        
        System.out.println("-------------------------------");
        //loop for taking input marks
        for(int i = 0; i<size; i++){
            System.out.print("Enter the Marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        //calling update function
        update(marks);
        
        System.out.println("-------------------------------");
        //for showing updated marks by +2
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Updated marks of Subject " + (i + 1) + " is " + marks[i]);
        }
        System.out.println();

    }

}

/*

Output :

Enter the no of subjects : 5
-------------------------------
Enter the Marks for Subject 1: 63
Enter the Marks for Subject 2: 65
Enter the Marks for Subject 3: 79
Enter the Marks for Subject 4: 78
Enter the Marks for Subject 5: 92
-------------------------------
Updated marks of Subject 1 is 65
Updated marks of Subject 2 is 67
Updated marks of Subject 3 is 81
Updated marks of Subject 4 is 80
Updated marks of Subject 5 is 94

 */