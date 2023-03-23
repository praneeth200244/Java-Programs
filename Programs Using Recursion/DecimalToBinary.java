import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any positive number: ");
        int n = scanner.nextInt();
        binaryRepresentation(n);
    }

    public static void binaryRepresentation(int n) {
        if (n == 0) {
            return;
        }
        binaryRepresentation(n/2);
        System.out.print(n%2);
    }
}
