//Execute one of the two approaches at a time

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter size of an array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        readElements(arr);

        //Naive approach
//        int result = removeDuplicatesNaive(arr);
//        printArrayElements(arr,result, "Naive method");

        //Efficient approach
        int result = removeDuplicatesEfficient(arr);
        printArrayElements(arr,result,"Efficient method");
    }

    public static void readElements(int[] arr) {
        for (int i=0; i< arr.length; i++) {
            System.out.print("Enter element-" + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("The elements of sorted array: ");
        for (int element: arr) {
            System.out.print(element + " ");
        }
    }

    public static int removeDuplicatesNaive(int[] arr) {
        int[] temp = new int[arr.length];
        temp[0] = arr[0];
        int res=1;

        for (int i=1; i< arr.length; i++) {
            if (temp[res-1] != arr[i]) {
                temp[res] = arr[i];
                res++;
            }
        }
        for (int i=0; i< res; i++) {
            arr[i] = temp[i];
        }
        return res;
    }

    public static int removeDuplicatesEfficient(int[] arr) {
        int res=1;

        for (int i=1; i< arr.length; i++) {
            if (arr[i] != arr[res-1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }

     public static void printArrayElements(int[] arr, int n, String method) {
         System.out.print("\nThe array elements after removing all duplicates(" + method + "): ");
         for (int i=0; i<n; i++) {
             System.out.print(arr[i] + " ");
         }
     }
}
