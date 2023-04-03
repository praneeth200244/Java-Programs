import java.util.Scanner;

public class LinearSearch {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter size of an array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        readElements(arr);
        System.out.print("\nEnter the element to be searched: ");
        int element = scanner.nextInt();
        int index = linearSearch(element,arr);
        if (index >= 0) {
            System.out.println(element + " is found at index-" + index);
        } else {
            System.out.println(element + " is not found in the array");
        }

    }
    public static void readElements(int[] arr) {
        for (int i=0; i< arr.length; i++) {
            System.out.print("Enter element-" + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("The elements of array are: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static int linearSearch(int element, int[] arr) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
