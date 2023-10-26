import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for N: ");
        int n = scanner.nextInt();
        System.out.println(n + "! = " + findFactorial(n));
    }

    public static int findFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * findFactorial(n-1);
    }
}
