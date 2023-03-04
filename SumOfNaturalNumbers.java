import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for n: ");
        int n = scanner.nextInt();
        m1(n);
        m2(n);
        m3(n);
    }

    public static void m1(int n) {
        System.out.println(n * (n + 1) / 2);
    }

    public static void m2(int n) {
        int sum = 0;
        for (int i=1; i<=n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void m3(int n) {
        int sum = 0;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++)
            {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
