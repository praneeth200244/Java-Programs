import java.util.Scanner;

public class DeletionOfElement {
    static Scanner scanner = new Scanner(System.in);
    static int n;
    public static void main(String[] args) {
        System.out.print("Enter size of an array: ");
        n = scanner.nextInt();
        int[] arr = new int[n];
        readElements(arr,n);
        System.out.print("\nEnter the element to be deleted: ");
        int element = scanner.nextInt();
        if (deleteElement(arr,element,n)) {
            System.out.println(element + " is deleted from the array");
        } else {
            System.out.println(element + " is not present in the array");
        }
        System.out.print("The elements of array are: ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
    public static void readElements(int[] arr, int n) {
        for (int i=0; i< n; i++) {
            System.out.print("Enter element-" + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("The elements of array are: ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static boolean deleteElement(int[] arr, int element, int size) {
        int i;
        for (i=0; i<n; i++) {
            if (arr[i] == element) {
                break;
            }
        }
        if (i == n) {
            return false;
        }
        for (int j=i; j<(n-1); j++) {
            arr[j] = arr[j+1];
        }
        n--;
        return true;
    }
}
