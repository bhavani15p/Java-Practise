import java.util.*;

public class reverseNo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number : ");
        int input = sc.nextInt();
       
        while(input > 0){
            int lastDigit = input % 10;
            System.out.print(lastDigit + " ");
            input /= 10;

        }
        
    }

}