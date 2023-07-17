/*
 
*****
*   *
*   *
*****
 
 */

public class pattern{

//     public static void hollowRectangle(int totRows, int totCols){
//         for(int i = 1; i<=totRows; i++){
//             for(int j=1;j<=totCols;j++){
//                 if(i == 1 || i == totRows || j == 1 || j == totCols){
//                     System.out.print("*");   //can be used-->System.out.print("*" + " ");
//                 }else{
//                     System.out.print(" "); //can be used-->System.out.print("  ");
//                 }
//                 }
//                 System.out.println();
//             }
//         }
//     public static void main(String args[]){
//         hollowRectangle(4, 5);
//     }
// }

public static void main(String args[]) {
    int totcol = 5;
    int totrow = 4;
    for (int i = 1; i <= totrow; i++) {
        for (int j = 1; j <= totcol; j++) {
           if(i == 1 || i == totrow || j== 1 || j == totcol){
            System.out.print("*");
           }else{
            System.out.print(" ");
           }
            }
        System.out.println();
            
        }
       
    }
}

