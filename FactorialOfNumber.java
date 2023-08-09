import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any positive number: ");
        int number = scanner.nextInt();
        System.out.println("By iterative method: " + number + "! = " + factorialOfNumber(number));
        System.out.println("By recursive method: " + number + "! = " + factorialOfNumberRecursive(number));
    }

    public static long factorialOfNumber(int number) {
        long result = 1;
        for (int i=2; i<=number; i++) {
            result *= i;
        }
        return result;
    }

    public static long factorialOfNumberRecursive(int number) {
        if (number == 0) {
            return 1;
        }
        return (number * factorialOfNumberRecursive(number - 1));
    }
    
}
