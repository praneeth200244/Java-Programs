import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        ReadElements.readElements(array);
        ReadElements.printElements(array);
        mergeSort(array,0,array.length-1);
        System.out.println("\nThe element(s) are sorted in non-decreasing order");
        ReadElements.printElements(array);
    }

    public static void mergeSort(int[] array, int low, int high){
        if (low < high) {
            int mid = low + ((high-low)/2);
            mergeSort(array,low,mid);
            mergeSort(array,mid+1,high);
            merge(array,low,mid,high);
        }
    }

    public static void merge(int[] array, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] leftHalf = new int[n1];
        int[] rightHalf = new int[n2];

        for (int i=0; i<n1; i++) {
            leftHalf[i] = array[low+i];
        }

        for (int i=0; i<n2; i++) {
            rightHalf[i] = array[mid+1+i];
        }

        int i=0, j=0, k=low;

        while (i < n1 && j < n2) {
            if (leftHalf[i] <= rightHalf[j]) {
                array[k++] = leftHalf[i++];
            } else {
                array[k++] = rightHalf[j++];
            }
        }

        while (i < n1) {
            array[k++] = leftHalf[i++];
        }
        while (j < n2) {
            array[k++] = rightHalf[j++];
        }
    }
}
