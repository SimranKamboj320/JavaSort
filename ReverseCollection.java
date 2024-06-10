import java.util.Arrays;
import java.util.Collections;

public class ReverseCollection {
    public static void main(String[] args) {
        Integer[] arr = {5, 3, 2, 4, 1}; // Integer array for reverse sorting
        
        // Sorting the array in reverse order
        Arrays.sort(arr, Collections.reverseOrder());

        //public static int compare(int a, int b){
            // a < b -ve
            // a == b 0
            // a > b +ve
            //return b-a;
        // }
        
        // Printing the sorted array using indexing
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
