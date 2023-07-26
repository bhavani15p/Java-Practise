import java.util.*;
import java.text.SimpleDateFormat;

public class customExceptionExample2 {

    static void convertDateFormat(String inputData){


        try{
            SimpleDateFormat sdf =  new SimpleDateFormat("dd/mm/yyyy");

            Date date = sdf.parse(inputData);

            SimpleDateFormat outputdf = new SimpleDateFormat("yyyy-MM-dd");
            String outputDate = outputdf.format(date);
            System.out.println("After changing date format to yyyy/MM/dd : " + outputDate);
        }
        catch(java.text.ParseException e){

            System.out.println("Some error occurred while converting date formats, Exception is : " + e);
        }
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         System.out.println("Enter date in dd/MM/yyyy format :  ");

         String inputDate = sc.nextLine();
         convertDateFormat(inputDate);
        
    }
    
}
