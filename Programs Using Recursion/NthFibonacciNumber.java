import java.util.Scanner;

public class NthFibonacciNumber {
    static int a;
    static int b;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any non-negative number: ");
        int n = scanner.nextInt();
        System.out.print("Enter first two fibonacci numbers: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(n + "th fibonacci number: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n == a || n == b) {
            return n;
        }
        return (fibonacci(n-1) + fibonacci(n-2));
    }
}
