import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any positive number: ");
        int number = scanner.nextInt();
        System.out.println("Prime factors of " + number + " is/are: ");
        System.out.print("Using naive method: ");
        primeFactors(number);
        System.out.print("\nUsing efficient method: ");
        primeFactorsEfficient(number);
        System.out.print("\nUsing optimized method: ");
        primeFactorsOptimized(number);
    }

    public static void primeFactorsEfficient(int number) {
        if (number <= 1) {
            return;
        }

        for (int i=2; i*i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }

        if (number > 1) {
            System.out.print(number);
        }
    }

    public static void primeFactors(int number) {
        for (int i=2; i<=number; i++) {
            if (isPrimeNumberEfficient(i)) {
                int x = i;
                while (number % x == 0) {
                    System.out.print(i + " ");
                    x *= i;
                }
            }
        }
    }

    public static void primeFactorsOptimized(int number)
    {
        if(number <= 1) {
            return;
        }

        while(number % 2 == 0) {
            System.out.print(2 + " ");
            number /= 2;
        }

        while(number % 3 == 0) {
            System.out.print(3 + " ");
            number /= 3;
        }

        for(int i=5; i*i<=number; i=i+6) {
            while(number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
            while(number % (i + 2) == 0) {
                System.out.print((i + 2) + " ");
                number /= (i + 2);
            }
        }

        if(number > 3)
            System.out.print(number + " ");
    }

    public static boolean isPrimeNumberEfficient(int number) {
        if (number == 1) {
            return false;
        }

        for (int i=2; i*i<=number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
