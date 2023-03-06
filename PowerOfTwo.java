import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any non-negative number: ");
        int n = scanner.nextInt();
        System.out.println(isPowerTwo(n));
        System.out.println(isPowerTwoEfficientMethod(n));
    }

    public static boolean isPowerTwo(int n) {
        if (n == 0) {
            return false;
        }
        while (n != 1) {
            if ((n % 2) != 0) {
                return false;
            }
            n /= 2;
        }
        return true;
    }

    public static boolean isPowerTwoEfficientMethod(int n) {
        if (n == 0) {
            return false;
        }
        return ((n & (n-1)) == 0);
    }
}
