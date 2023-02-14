import java.util.Scanner;

public class LCMofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any two non-negative numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("GCD of " + a + " and " + b + " is " + lcmOfNumbers(a,b));
        System.out.println("GCD of " + a + " and " + b + "(using optimized solution) is " + lcmOptimized(a,b));
    }

    public static int lcmOfNumbers(int a,int b) {
        int max = Math.max(a,b);

        while (true) {
            if ((max % a == 0) && (max % b == 0)) {
                break;
            }
            max++;
        }
        return max;
    }

    public static int lcmOptimized(int a, int b) {
        return ((a*b) / gcdUsingOptimizedEuclideanAlgorithm(a,b));
    }

    public static int gcdUsingOptimizedEuclideanAlgorithm(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdUsingOptimizedEuclideanAlgorithm(b,(a%b));
    }
}
