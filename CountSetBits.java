import java.util.Scanner;

public class CountSetBits {
    static int[] table = new int[256];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any non-negative number: ");
        int n = scanner.nextInt();
        System.out.println("Naive Solution-1: " + naiveSolution_1(n));
        System.out.println("Naive Solution-2: " + naiveSolution_2(n));
        System.out.println("Brian Kerringam's: " + brainKerringams(n));
        initialize();
        System.out.println("Look-up table solution: " + countSetBits(n));
    }

    public static int naiveSolution_1(int n) {
        int count = 0;
        while (n > 0) {
            if ((n % 2) == 1) {
                count++;
            }
            n /= 2;
        }
        return count;
    }

    public static int naiveSolution_2(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1);
            n /= 2;
        }
        return count;
    }

    public static int brainKerringams(int n) {
        int count = 0;
        while (n > 0) {
            n &= (n-1);
            count++;
        }
        return count;
    }

    //Look-up table solution
    public static void initialize() {
        table[0] = 0;
        for (int i=1; i<256; i++) {
            table[i] = table[i & (i -1)] + 1;
        }
    }

    public static int countSetBits(int n) {
        return (table[n&255] + table[(n >> 8) & 255] + table[(n >> 16) & 255] + table[(n >> 24)]);
    }
}