public class ArrayIndexOutOfBoundExceptionSample {
    public static void main(String[] args) {

        try{
            int arr[] = new int[5];
            arr[7] = 9;
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of Bounds");
        }
        
    }

}
