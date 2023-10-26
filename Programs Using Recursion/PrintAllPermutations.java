import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrintAllPermutations {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] originalArray = new int[n];
        boolean[] isTaken = new boolean[n];
        Arrays.fill(isTaken, false);

        readElements(originalArray);
        printElements(originalArray);

        printPermutations(isTaken, new ArrayList<Integer>(), originalArray);
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

    public static void printPermutations(boolean[] isTaken, ArrayList<Integer> combination, int[] originalArray) {
        if (combination.size() == originalArray.length) {
            System.out.println(combination);
            return;
        }

        for (int i = 0; i < originalArray.length; i++) {
            if (!isTaken[i]) {
                isTaken[i] = true;
                combination.add(originalArray[i]);
                printPermutations(isTaken, combination, originalArray);
                combination.remove(combination.size()-1);
                isTaken[i] = false;
            }
        }
    }
}
