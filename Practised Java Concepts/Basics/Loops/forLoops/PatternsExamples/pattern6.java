/*

A
B C
D E F
G H I J

 */
//use this n-i+1, j for inverted , i for series
public class pattern6 {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=i;j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        
    }    
}
