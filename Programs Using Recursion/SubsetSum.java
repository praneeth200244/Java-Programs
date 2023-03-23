import java.util.Scanner;

public class SubsetSum {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number of elements in set: ");
        int n = scanner.nextInt();
        int[] S = new int[n];
        readElements(S);
        System.out.print("Enter the sum: ");
        int sum = scanner.nextInt();
        System.out.println("Number of subsets in which sum of elements is " + sum + " is " + subsetSum(S,n,sum));
    }

    public static void readElements(int[] arr) {
        System.out.println("Enter the elements of set: ");
        for (int i=0; i< arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public static int subsetSum(int[] arr, int n, int sum) {
        if (n == 0) {
            return ((sum == 0) ? 1 : 0);
        }
        return (subsetSum(arr,n-1,sum) + subsetSum(arr,n-1,sum-arr[n-1]));
    }
}
