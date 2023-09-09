public class Prime {

    public static void printPrimes(int num) {
        boolean[] prime = new boolean[num + 1];
        
        for (int i = 2; i * i <= num; i++) {
            if (prime[i] == false) {
                for (int j = i * i; j <= num; j += i) {
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i <= num; i++) {
            if (prime[i] == false) {
                System.out.println(i);
            }
        }
    }
    
    public static boolean isPrimeOptimized(int num) {
        if (num <= 1) {
            return false;
        }
        
        if (num <= 3) {
            return true;
        }
        
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        int i = 5;
        while (i * i <= num) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }

    public static boolean isPrime(int num){
        int temp = 0;
        for(int i=1; i<=num; i++){
            if(num % i == 0){
                temp++;
            }
        }
        if(temp == 2){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int num = 2;
        System.out.println(isPrime(num));
        // System.out.println(isPrimeOptimized(num));
       //printPrimes(num);
    }
    
}
