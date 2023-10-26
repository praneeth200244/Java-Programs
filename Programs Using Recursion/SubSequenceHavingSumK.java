import java.util.ArrayList;
import java.util.Scanner;

public class SubSequenceHavingSumK {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] originalArray = new int[n];
        readElements(originalArray);
        printElements(originalArray);

        System.out.print("Enter value for k: ");
        int k = scanner.nextInt();

        ArrayList<Integer> subsequence = new ArrayList<>();

        System.out.println("Subsequences having sum as " + k + " is/are: ");
        printSubsequence(0, subsequence, 0, originalArray, k);
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

    public static void printSubsequence(int index, ArrayList<Integer> subsequence, int sum, int[] originalArray, int k) {
        if (index >= originalArray.length) {
            if (sum == k) {
                System.out.println(subsequence);
            }
            return;
        }

        subsequence.add(originalArray[index]);
        sum += originalArray[index];
        printSubsequence((index+1), subsequence, sum, originalArray, k);

        subsequence.remove(subsequence.size()-1);
        sum -= originalArray[index];
        printSubsequence((index+1), subsequence, sum, originalArray, k);
    }
}
