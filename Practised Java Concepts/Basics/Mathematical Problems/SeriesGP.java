public class SeriesGP {

    public static void printGPSeries(int a, int r, int n){
        int currTerm;
        for(int i=0; i<n; i++){
            currTerm = a * (int)Math.pow(r, i);
            System.out.print(currTerm + " ");
        }
    }

    public static void main(String[] args) {
        int a = 2;
        int r = 3;
        int n = 8;
        printGPSeries(a,r,n);
    }
    
}
