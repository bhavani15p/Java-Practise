/*

A
A B
A B C
A B C B

 */
//use this n-i+1, j for inverted , i for series
public class pattern7 {
    public static void main(String[] args) {
        int n = 8;
       
        for(int i = 1; i<=n;i++){
            char ch = 'A';
            for(int j = 1; j<=i;j++){
                System.out.print(ch + " ");
                ch++;
            }
            
            System.out.println();
        }
        
    }    
}
