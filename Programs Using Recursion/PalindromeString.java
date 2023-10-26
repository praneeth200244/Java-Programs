import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string (in lowercase): ");
        String string = scanner.nextLine();
        if (isPalindrome(string, 0, string.length())) {
            System.out.println(string + " is a palindrome string");
        } else {
            System.out.println(string + " is not a palindrome string");
        }
    }

    public static boolean isPalindrome(String s, int index, int n) {
        if (index >= (n/2)) {
            return true;
        }
        if (s.charAt(index) != s.charAt(n-index-1)) {
            return false;
        }

        return isPalindrome(s, index+1, n);
    }
}
