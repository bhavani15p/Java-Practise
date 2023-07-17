import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a nth term (number) fibonacci series : ");
        int count = sc.nextInt();
        int firstNo = 0, secondNo = 1, i = 1;
        while(i<=count){
            System.out.print(firstNo + " ");
            int sum = firstNo + secondNo;
            firstNo = secondNo;
            secondNo = sum;
            i++;
            

        }
    }
    
}
