import java.util.Scanner;

public class PowerSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String s = scanner.nextLine();
        printPowerSet(s);
    }

    public static void printPowerSet(String s) {
        int n = s.length();
        int pSize = (1 << n);
        for (int i=0; i<pSize; i++){
            for (int j=0; j<n; j++) {
                if((i & (1 << j)) != 0) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
