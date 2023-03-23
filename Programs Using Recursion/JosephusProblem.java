import java.util.Scanner;

public class JosephusProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int noOfElements = scanner.nextInt();
        System.out.print("Enter the element which has to removed in every iteration: ");
        int diedElement = scanner.nextInt();
        System.out.println("The survived element(for indexing-0): " + josephusProblem(noOfElements, diedElement));
        System.out.println("The survived element(for indexing-1): " + (josephusProblem(noOfElements, diedElement) + 1));
    }

    public static int josephusProblem(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return ((josephusProblem(n-1,k) + k) % n);
    }
}
