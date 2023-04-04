import java.util.Scanner;

public class SecondLargestElement {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter size of an array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        readElements(arr);
        System.out.println("\nSecond largest element in an array(Naive Method): " + secondLargestNaive(arr));
        System.out.println("Second largest element in an array(Efficient Method): " + secondLargestEfficient(arr));
    }

    public static void readElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element-" + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("The elements of array are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static int secondLargestNaive(int[] arr) {
        int largest = LargestElementOfArray.largestElement__2(arr);
        int secondLargest = -1;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != largest) {
                if (secondLargest == -1 || (arr[i] > arr[secondLargest])) {
                    secondLargest = i;
                }
            }
        }
        return arr[secondLargest];
    }

    public static int secondLargestEfficient(int[] arr) {
        int largest = 0;
        int secondLargest = -1;
        for (int i=1; i<arr.length; i++) {
            if (arr[i] > arr[largest]) {
                secondLargest = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                if ((arr[i] > arr[secondLargest]) || secondLargest == -1) {
                    secondLargest = i;
                }
            }
        }
        return arr[secondLargest];
    }
}
