import java.util.Scanner;

public class IsPalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any positive number: ");
        int number = scanner.nextInt();
        if (isPalindromeNumber(number)) {
            System.out.println(number + " is a palindrome number");
        } else {
            System.out.println(number + " is not a palindrome number");
        }
    }

    public static boolean isPalindromeNumber(int number) {
        int reverseNumber = 0;
        int duplicateNumber = number;
        while (duplicateNumber > 0) {
            int lastDigit = duplicateNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            duplicateNumber /= 10;
        }
        return (reverseNumber == number);
    }
}
