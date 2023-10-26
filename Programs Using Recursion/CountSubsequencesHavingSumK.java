import java.util.Scanner;

public class CountSubsequencesHavingSumK {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] originalArray = new int[n];
        readElements(originalArray);
        printElements(originalArray);

        System.out.print("Enter value for k: ");
        int k = scanner.nextInt();

        System.out.println("Subsequences having sum as " + k + " is/are: " + printSubsequence(0, 0, originalArray, k));

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

    public static int printSubsequence(int index, int sum, int[] originalArray, int k) {
        //The condition is applicable if array contains only the positive numbers
        if (sum > k) {
            return 0;
        }
        if (index >= originalArray.length) {
            if (sum == k) {
                return 1;
            }
            return 0;
        }

        sum += originalArray[index];
        int left = printSubsequence((index+1), sum, originalArray, k);

        sum -= originalArray[index];
        int right = printSubsequence((index+1), sum, originalArray, k);

        return (left + right);
    }
}
