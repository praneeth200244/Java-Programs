import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any non-negative number: ");
        int n = scanner.nextInt();
        System.out.println("Sum of first " + n + " natural numbers: " + sumOfNaturalNumbers(n));
    }

    public static int sumOfNaturalNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        return (n + sumOfNaturalNumbers(n-1));
    }
}
