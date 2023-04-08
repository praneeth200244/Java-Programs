import java.util.Scanner;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        LinearSearch.readElements(arr);

        //Naive Method
        if (naiveCheck(arr)) {
            System.out.println("\n(Naive method)The array is sorted");
        } else {
            System.out.println("\n(Naive method)The array is not sorted");
        }

        //Efficient Method
        if (efficientCheck(arr)) {
            System.out.println("(Efficient method)The array is sorted");
        } else {
            System.out.println("(Efficient method)The array is not sorted");
        }
    }

    public static boolean naiveCheck(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=(i+1); j<arr.length; j++) {
                if (arr[j] < arr[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean efficientCheck(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
    }
}
