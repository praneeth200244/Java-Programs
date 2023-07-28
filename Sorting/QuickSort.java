import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        ReadElements.readElements(array);
        ReadElements.printElements(array);

        System.out.print("\nEnter the pivot position: ");
        int pivotPosition = scanner.nextInt();

        naivePartition(array, 0, (n-1), pivotPosition);
        ReadElements.printElements(array);
    }

    public static void naivePartition(int[] array, int low, int high, int pivotPosition) {
        int[] temp = new int[high-low+1];
        int index = 0;

        for (int i=low; i<=high; i++) {
            if (array[i] <= array[pivotPosition]) {
                temp[index++] = array[i];
            }
        }

        for (int i=low; i<=high; i++) {
            if (array[i] > array[pivotPosition]) {
                temp[index++] = array[i];
            }
        }

        for (int i=low; i<=high; i++) {
            array[i] = temp[i-low];
        }
    }
}
