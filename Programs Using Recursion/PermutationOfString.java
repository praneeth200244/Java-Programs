import java.util.Scanner;

public class PermutationOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String S = scanner.nextLine();
        System.out.println("The permutation of string-" + S + " is/are: ");
        permutationOfString(S, 0);
    }
    public static void permutationOfString(String str, int i)
    {
        if (i == str.length()-1) {
            System.out.println(str);
        } else {
            for (int j = i; j <= str.length()-1; j++) {
                str = swap(str,i,j);
                permutationOfString(str, i+1);
                str = swap(str,i,j);
            }
        }
    }
    public static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
