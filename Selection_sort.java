import java.util.*;

public class JavaSort {
    public static void Selection_sort(int arr[]){
        //turn=i
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for (int j=i+1; j<arr.length; j++){
                if (arr[minPos]>arr[j]){
                    //update minPos
                    //if (arr[minPos]>arr[j]){ for decreasing order
                    minPos = j;
                }
            }
            //swap    
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,3,2,4,1};
        Selection_sort(arr);
        printArr(arr);
    }
} 