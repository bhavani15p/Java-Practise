/*

****
***
**
*

 */

 //use (n-i+1) for inverted triangle
public class pattern3 {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i<=4;i++){
            for(int j = 1; j<=n-i+1; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        
    }    
}
