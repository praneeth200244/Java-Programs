import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String palindromeCheck = scanner.nextLine();

        if (isPalindrome(palindromeCheck)) {
            System.out.print(palindromeCheck + " is a palindrome string");
        } else {
            System.out.print(palindromeCheck + " is not a palindrome string");
        }
    }

    public static boolean isPalindrome (String palindromeCheck) {
        int leftIndex = 0;
        int rightIndex = palindromeCheck.length()-1;

        while (leftIndex < rightIndex) {
            if (palindromeCheck.charAt(leftIndex) != palindromeCheck.charAt(rightIndex)) {
                return false;
            }
            leftIndex++;
            rightIndex--;
        }

        return true;
    }
}
