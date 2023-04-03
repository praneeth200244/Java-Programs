import java.util.Scanner;

public class InsertionOfElement {
    static Scanner scanner = new Scanner(System.in);
    static int n;
    public static void main(String[] args) {
        System.out.print("Enter size of an array: ");
        n = scanner.nextInt();
        int[] arr = new int[n+2];
        readElements(arr,n);
        System.out.print("\nEnter the element and the position at which the element has to be inserted: ");
        int element = scanner.nextInt();
        int position = scanner.nextInt();
        if (insertElement(arr,element,position,n,arr.length)) {
            System.out.println(element + " is inserted at desired position");
        } else {
            System.out.println(element + " cannot be inserted as the array is full");
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

    public static boolean insertElement(int[] arr, int element, int position, int size, int capacity) {
        if (capacity == size) {
            return false;
        }
        int index = position-1;
        for (int i=(size-1); i>=index; i--) {
            arr[i+1] = arr[i];
        }
        arr[index] = element;
        n++;
        return true;
    }
}
