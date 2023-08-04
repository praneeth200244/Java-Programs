import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any positive number: ");
        int number = scanner.nextInt();
        System.out.println("Number of digits in " + number + " is " + countDigits(number));
    }

    public static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
    
}
