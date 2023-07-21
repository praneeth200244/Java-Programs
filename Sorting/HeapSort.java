import java.util.Scanner;

public class HeapSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        ReadElements.readElements(array);
        ReadElements.printElements(array);
        heapSort(array);
        System.out.println("\nThe element(s) are sorted in non-decreasing order");
        ReadElements.printElements(array);
    }

    public static void heapify(int[] array, int n, int i) {
        int largest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        if (leftChild < n && array[leftChild] > array[largest]) {
            largest = leftChild;
        }
        if (rightChild < n && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heapify(array,n,largest);
        }
    }

    public static void buildMaxHeap(int[] array,int n) {
        for (int i=(n/2)-1; i>=0; i--) {
            heapify(array,n,i);
        }
    }
    
    public static void heapSort(int[] array) {
        int n = array.length;
        buildMaxHeap(array,n);
        for (int i= n-1; i>=1; i--) {
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            heapify(array,i,0);
        }
    }
}


