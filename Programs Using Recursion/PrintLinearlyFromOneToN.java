import java.util.Scanner;

public class PrintLinearlyFromOneToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for N: ");
        int n = scanner.nextInt();
        printLinearly(1, n);
        System.out.println("\n\n\n\n");
        printLinearlyUsingBacktracking(n);
    }

    public static void printLinearly(int number, int n) {
        if (number > n) {
            return;
        }
        System.out.println(number);
        printLinearly(++number, n);
    }

    public static void printLinearlyUsingBacktracking(int n) {
        if (n < 1) {
            return;
        }
        printLinearlyUsingBacktracking(n-1);
        System.out.println(n);
    }
}
