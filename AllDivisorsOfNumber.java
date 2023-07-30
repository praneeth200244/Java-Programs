import java.util.Scanner;

public class AllDivisorsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any positive number: ");
        int number = scanner.nextInt();
        System.out.println("All divisors of " + number + " is/are: ");
        naiveMethod(number);
        efficientMethod(number);
        moreEfficientMethod(number);
    }

    public static void naiveMethod(int number) {
        System.out.print("Naive method: ");
        for (int i=1; i<=number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void efficientMethod(int number) {
        System.out.print("\nEfficient method: ");
        for (int i=1; i*i<=number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                if (i != (number/i)) {
                    System.out.print((number/i) + " ");
                }
            }
        }
    }

    public static void moreEfficientMethod(int number) {
        System.out.print("\nMore efficient method: ");
        int i;
        for (i=1; i*i<number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        if (number % i == number % (i-1)) {
            i--;
        }
        for (; i>=1; i--) {
            if (number % i == 0) {
                System.out.print((number/i) + " ");
            }
        }
    }
    
}
