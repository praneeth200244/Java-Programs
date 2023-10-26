import java.util.ArrayList;
import java.util.Scanner;

public class PrintAllPermutationsOptimal {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] originalArray = new int[n];
        readElements(originalArray);
        printElements(originalArray);

        printPermutations(originalArray, 0, new ArrayList<Integer>());

    }

    public static void readElements(int[] originalArray) {
        for (int i=0; i<originalArray.length; i++) {
            System.out.print("Enter element-" + (i+1) + ": ");
            originalArray[i] = scanner.nextInt();
        }
    }

    public static void printElements(int[] originalArray) {
        System.out.print("The elements of array are: ");
        for (int i=0; i<originalArray.length; i++) {
            System.out.print(originalArray[i] + " ");
        }
        System.out.println();
    }

    public static void printPermutations(int[] originalArray, int index, ArrayList<Integer> combination) {
        if (index == originalArray.length) {
            for (int j = 0; j < originalArray.length; j++) {
                System.out.print(originalArray[j] + " ");
            }
            System.out.println();
            return;
        }


        for (int i = index; i < originalArray.length; i++) {
            swap(i, index, originalArray);
            printPermutations(originalArray, (index+1), combination);
            swap(i, index, originalArray);
        }
    }

    public static void swap(int i, int j, int[] originalArray) {
        int temp = originalArray[i];
        originalArray[i] = originalArray[j];
        originalArray[j] = temp;
    }
}
