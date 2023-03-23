import java.util.Scanner;

public class Logarithm {
    static int base;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        base = scanner.nextInt();
        System.out.print("Enter any non-negative number: ");
        int n = scanner.nextInt();
        System.out.println(logarithm(n) + "(floor value)");
    }

    public static int logarithm(int n) {
        if (n < base) {
            return 0;
        } else  {
            return (1 + logarithm(n/base));
        }
    }
}
