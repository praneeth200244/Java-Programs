import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for n: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element-" + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        reverseArray(0, (n-1), arr);
        printArrayElements(arr);

        System.out.println();

        reverseArrayUsingIndex(0, arr, n);
        printArrayElements(arr);
    }

    public static void reverseArrayUsingIndex(int index, int[] arr, int n) {
        if (index >= (n/2)) {
            return;
        }
        int temp = arr[index];
        arr[index] = arr[n-index-1];
        arr[n-index-1] = temp;

        reverseArrayUsingIndex((index+1), arr, n);
    }

    public static void reverseArray(int left, int right, int[] arr) {
        if (left >= right) {
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverseArray((left+1), (right-1), arr);
    }

    public static void printArrayElements(int[] array) {
        System.out.print("The array elements are: ");
        for (int i = 0; i <  array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
