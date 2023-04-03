import java.util.Scanner;

public class LargestElementOfArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter size of an array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        readElements(arr);
        System.out.println("\nThe largest element in the array is " + largestElement__1(arr));
        System.out.println("The largest element in the array is " + largestElement__2(arr));
    }

    public static void readElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element-" + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("The elements of array are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static int largestElement__1(int[] arr) {
        for (int i=0; i< arr.length; i++) {
            boolean flag = true;
            for (int j=0; j< arr.length; j++) {
                if (arr[i] < arr[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int largestElement__2(int[] arr) {
        int largestElement = arr[0];
        for (int i=1; i< arr.length; i++) {
            if (arr[i] > largestElement) {
                largestElement = arr[i];
            }
        }
        return largestElement;
    }
}