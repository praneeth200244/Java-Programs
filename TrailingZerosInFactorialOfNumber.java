import java.util.Scanner;

public class TrailingZerosInFactorialOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any positive number: ");
        int number = scanner.nextInt();
        System.out.println("Number of trailing zeros in " + number + "! is " + countTrailingZeros(number));
        System.out.println("Number of trailing zeros in " + number + "!(using efficient method) is " + countTrailingZerosEfficientMethod(number));
    }

    //Works if (0=<number<=20)
    public static int countTrailingZeros(int number) {
        long result = 1;
        for (int i=2; i<=number; i++) {
            result *= i;
        }
        System.out.println(number + "! = " + result);

        int count = 0;
        while ((result % 10) == 0) {
            result /= 10;
            count++;
        }

        return count;
    }

    public static int countTrailingZerosEfficientMethod(int number) {
        int count = 0;
        for (int i=5; i<=number; i*=5) {
            count += (number / i);
        }
        return count;
    }
}
