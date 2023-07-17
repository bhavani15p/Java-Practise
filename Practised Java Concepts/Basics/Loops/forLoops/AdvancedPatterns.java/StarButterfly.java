/*
 

*                             * 
* *                         * * 
* * *                     * * * 
* * * *                 * * * * 
* * * * *             * * * * * 
* * * * * *         * * * * * * 
* * * * * * *     * * * * * * * 
* * * * * * * * * * * * * * * * 
* * * * * * * * * * * * * * * * 
* * * * * * *     * * * * * * * 
* * * * * *         * * * * * * 
* * * * *             * * * * * 
* * * *                 * * * * 
* * *                     * * * 
* *                         * * 
*                             * 


*/

public class StarButterfly {
   
    public static void butterfly(int n){
        
        //Outer Loop - 1st half of butterfly
        for(int i=1; i<=n; i++){

            //Lines - stars + spaces + stars
            //for printing stars
            for(int j=1; j<=i; j++){
                System.out.print("*" + " ");
            }

            //for printing spaces in-between 
            //i = 1, spaces = 6, i.e 2*3
            //i = 2, spaces = 4, i.e 2*2
            //i = 3, spaces = 2, i.e 2*1
            // 2 * (n - i) = 2 * (4 - 1) = 6
            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }

            //printing stars
            for(int j=1; j<=i; j++){
                System.out.print("*" + " ");
            }

            System.out.println();

        }

        for(int i=n; i>=1; i--){

            //Lines - stars + spaces + stars
            //for printing stars
            for(int j=1; j<=i; j++){
                System.out.print("*" + " ");
            }

            //for printing spaces in-between 
            //i = 1, spaces = 6, i.e 2*3
            //i = 2, spaces = 4, i.e 2*2
            //i = 3, spaces = 2, i.e 2*1
            // 2 * (n - i) = 2 * (4 - 1) = 6
            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }

            //printing stars
            for(int j=1; j<=i; j++){
                System.out.print("*" + " ");
            }

            System.out.println();
            
        }

    }
    
    public static void main(String args[]){
        butterfly(8);
    }
}