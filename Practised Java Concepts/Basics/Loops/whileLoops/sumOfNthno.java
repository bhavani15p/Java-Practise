import java.util.*;

public class sumOfNthno{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a nth value for sum : ");
       int input = sc.nextInt();
       int i = 1;
       int sum = 0;
       while(i<=input){
        sum += i;
        i++;
       }
       System.out.println("The sum of " + input + " is : " + sum);
    }
}