import java.util.Scanner;

public class GCDofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any two non-negative numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("GCD of " + a + " and " + b + " is " + gcdOfNumbers(a,b));
        System.out.println("GCD of " + a + " and " + b + "(using Euclidean algorithm) is " + gcdUsingEuclideanAlgorithm(a,b));
        System.out.println("GCD of " + a + " and " + b + "(using optimized Euclidean algorithm) is " + gcdUsingOptimizedEuclideanAlgorithm(a,b));
    }

    public static int gcdOfNumbers(int a,int b) {
        int min = Math.min(a,b);

        while (min > 0) {
            if ((a % min == 0) && (b % min == 0)) {
                break;
            }
            min--;
        }
        return min;
    }

    public static int gcdUsingEuclideanAlgorithm(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public static int gcdUsingOptimizedEuclideanAlgorithm(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdUsingOptimizedEuclideanAlgorithm(b,(a%b));
    }
}
