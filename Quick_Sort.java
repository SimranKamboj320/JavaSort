import java.util.*;

public class JavaSort {
    public static void Quick_Sort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // Pivot element=last element
        int pidx = partition(arr, si, ei);
        Quick_Sort(arr, si, pidx - 1); // Left
        Quick_Sort(arr, pidx + 1, ei); // Right
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // To make place for elements smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // Swap
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 9, 2, 5 };
        Quick_Sort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
