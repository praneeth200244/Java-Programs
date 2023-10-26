import java.util.Scanner;

public class PrintFromNToOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for N: ");
        int n = scanner.nextInt();
        printNToOne(n, n);
        System.out.println("\n\n\n\n");
        printNToOneUsingBackTracking(n);
    }

    public static void printNToOne(int number, int n) {
        if (number < 1) {
            return;
        }
        System.out.println(number);
        printNToOne(--number, n);
    }

    public static void printNToOneUsingBackTracking(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        printNToOneUsingBackTracking(n-1);
    }
}
