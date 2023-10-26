import java.util.Scanner;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for N: ");
        int n = scanner.nextInt();
        System.out.println("Sum of first " + n + " natural numbers: " + findSum(n));
    }

    public static int findSum(int n) {
        if (n < 1) {
            return 0;
        }
        return n + findSum(n-1);
    }
}
