import java.util.Scanner;

public class CheckKthBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for n and k: ");
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println("Method-1: " + naiveSolution_1(n,k));
        System.out.println("Method-2: " + naiveSolution_2(n,k));
        System.out.println("Method-3: " + efficientSolution_1(n,k));
        System.out.println("Method-4: " + efficientSolution_2(n,k));
    }

    public static boolean naiveSolution_1(int n, int k) {
        int x = 1;
        for (int i=0; i<(k-1); i++) {
            x *= 2;
        }
        if ((n & x) != 0) {
            return true;
        }
        return false;
    }

    public static boolean naiveSolution_2(int n, int k) {
        for (int i=0; i<(k-1); i++) {
            n /= 2;
        }
        if ((n & 1) != 0) {
            return true;
        }
        return false;
    }

    public static boolean efficientSolution_1(int n, int k) {
        int x = (1 << (k-1));

        if ((n & x) != 0) {
            return true;
        }
        return false;
    }

    public static boolean efficientSolution_2(int n, int k) {
        int x = (n >> (k-1));

        if ((n & 1) != 0) {
            return true;
        }
        return false;
    }
    
}
