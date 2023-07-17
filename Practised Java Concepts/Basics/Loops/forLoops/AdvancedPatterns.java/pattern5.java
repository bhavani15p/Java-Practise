/*
 
a
b c
d e f
g h i j
k l m n o
 
 */


 public class pattern5{
    public static void main(String args[]){
        int n = 5;
        char ch ='a';
        for(int i = 1; i<=n; i++){
            for(int j = 1;j<=i;j++){ //use n-i+1 for inverted triangle
                System.out.print(ch +" ");
                ch++;
            }
            System.out.println();
        }

    }
}