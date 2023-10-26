import java.util.ArrayList;
import java.util.Scanner;

public class AllSubsequenceOfArray {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] originalArray = new int[n];
        readElements(originalArray);
        printElements(originalArray);

        ArrayList<Integer> subsequence = new ArrayList<>();

        System.out.println("All subsequences of array: ");
        printSubsequence(0,originalArray,subsequence);

        ArrayList<Integer> subsequenceReverse = new ArrayList<>();

        System.out.println("\n\nAll subsequences of array(in reverse order): ");
        printSubsequenceReverse(0,originalArray,subsequenceReverse);
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

    public static void printSubsequence(int index, int[] originalArray, ArrayList<Integer> subsequence) {
        if (index >= originalArray.length) {
            System.out.println(subsequence);
            return;
        }

        subsequence.add(originalArray[index]);
        printSubsequence(index + 1, originalArray, subsequence);
        subsequence.remove(subsequence.size() - 1); // Remove the last element added
        printSubsequence(index + 1, originalArray, subsequence);
    }

    public static void printSubsequenceReverse(int index, int[] originalArray, ArrayList<Integer> subsequence) {
        if (index >= originalArray.length) {
            System.out.println(subsequence);
            return;
        }

        printSubsequenceReverse(index + 1, originalArray, subsequence);
        subsequence.add(originalArray[index]);
        printSubsequenceReverse(index + 1, originalArray, subsequence);
        subsequence.remove(subsequence.size() - 1); // Remove the last element added
    }

}
