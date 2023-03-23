import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String s = scanner.nextLine();
        System.out.println(isPalindrome(s,0,s.length()-1));
    }

    public static boolean isPalindrome(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        return ((s.charAt(start) == s.charAt(end)) && (isPalindrome(s,start+1,end-1)));
    }
}
