public class DuplicatesZeros {
    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        int i = 0; 
        int j = 0; 

        for (i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j++;
            }
        }

        i = n - 1; 

        while (j > 0 && i >= 0) {
            if (arr[i] == 0) {
                if (j + i < n) {
                    arr[j + i] = 0; 
                }
                j--;
                if (j + i < n) {
                    arr[j + i] = 0; 
                }
            } else {
                if (j + i < n) {
                    arr[j + i] = arr[i]; 
                }
            }
            i--;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZeros(arr);
        printArray(arr);

    }
}
