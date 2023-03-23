import java.util.Scanner;

public class PrintNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any natural number: ");
        int n = scanner.nextInt();
        print1toN(n);
        System.out.println();
        printNto1(n);
    }

    public static void printNto1(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNto1(n-1);
    }

    public static void print1toN(int n) {
        if (n == 0) {
            return;
        }
        print1toN(n-1);
        System.out.print(n + " ");
    }
}
