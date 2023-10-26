import java.util.Scanner;

public class PrintNameNTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for N: ");
        int n = scanner.nextInt();
        printNames(1, n);
    }

    public static void printNames(int count, int n) {
        if (count > n) {
            return;
        }
        System.out.println("Mangaluru");
        printNames(++count, n);
    }
}
