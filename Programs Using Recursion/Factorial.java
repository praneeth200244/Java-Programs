import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any non-negative number: ");
        int n = scanner.nextInt();
        System.out.println(n + "!=" + factorial(n));
        System.out.println(n + "!=" + factorialTailRecursive(n,1));

    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return (n*factorial(n-1));
    }

    public static int factorialTailRecursive(int n, int k) {
        if (n == 0 || n == 1) {
            return k;
        }
        return factorialTailRecursive(n-1,k*n);
    }
}
