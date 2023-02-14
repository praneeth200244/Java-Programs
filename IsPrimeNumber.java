import java.util.Scanner;

public class IsPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any natural number: ");
        int number = scanner.nextInt();
        if (isPrimeNumber(number)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if ((n % 2 == 0) || (n % 3 == 0)) {
            return false;
        }

        for (int i = 5; i*i <= n; i += 6) {
            if ((n % i == 0) || (n % (i + 2) == 0)) {
                return false;
            }
        }
        return true;
    }
}
