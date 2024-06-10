import java.util.Arrays;

public class JavaSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1};
        
        // Using Arrays.sort() to sort the array
        Arrays.sort(arr);
        
        // Printing the sorted array
        for (int num : arr) { //using indexing
            System.out.print(num + " ");
        }
    }
}
