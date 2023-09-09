public class NumberOfDigits {

    public static int countDigits(int num){

        int count = 0;
        while(num != 0){
            num = num/10;
            count++;

        }
        return count;

    }
    public static void main(String[] args) {
        int num = 1234567891;
       System.out.println( countDigits(num));
        
    }
    
}
