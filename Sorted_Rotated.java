import java.util.*;

public class JavaSort {
    public static int Sorted_Rotated(int arr[], int tar, int si, int ei) {

        //kaam
        int mid = si + (ei-si)/2;  //(si+ei)/2

        //case Found
        if (arr[mid] == tar) {
            return mid;
        }

        // mid on L1
        if(arr[si] <= arr[mid]){
            //case a:left
            if(arr[si] <=tar && tar <= arr[mid]){
                return Sorted_Rotated(arr, tar, si, mid-1);
            }else {
                //case b: right
                return Sorted_Rotated(arr, tar, mid+1, ei);
            }
        }
        //mid on L2
        else{
            //case c: right
            if(arr[mid] <= tar && tar <= arr[ei]){
                return Sorted_Rotated(arr, tar, mid+1, ei);
            }else{
                //case d: left
                return Sorted_Rotated(arr, tar, si, mid-1);
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0; //target = 4
        int tarIdx = Sorted_Rotated(arr, target, 0, arr.length - 1);
        System.out.println(tarIdx);
    }
}
