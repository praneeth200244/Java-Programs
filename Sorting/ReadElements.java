import java.util.Scanner;

public class ReadElements {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        readElements(array);
        printElements(array);
    }

    public static void readElements(int[] array) {
        System.out.println("****Enter the elements of array****");
        for (int i=0; i< array.length; i++) {
            System.out.print("Enter element-" + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }
    }

    public static void printElements(int[] array) {
        System.out.print("The elements of array is/are: ");
        for (int i=0; i< array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
}
