import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        LinearSearch.readElements(arr);
        reverseArray(arr);
    }

    public static void reverseArray(int[] arr) {
        int low = 0, high = (arr.length-1);

        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }

        System.out.print("\nThe elements of array(in reverse order): ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
