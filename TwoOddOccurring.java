import java.util.Scanner;

public class TwoOddOccurring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] numArray = new int[n];
        for (int i=0; i<numArray.length; i++) {
            numArray[i] = scanner.nextInt();
        }
        System.out.print("Two odd occurring elements: ");
        twoOddOccurring(numArray);
        System.out.print("\nTwo odd occurring elements (by efficient method): ");
        findTwoOdd(numArray);
    }

    public static void twoOddOccurring(int[] numArray) {
        int i;
        int result = 0;
        for (i=0; i<numArray.length; i++) {
            int count = 0;
            for (int j=0; j<numArray.length; j++) {
                if (numArray[i] == numArray[j]) {
                    count++;
                }
            }
            if ((count % 2) != 0) {
                System.out.print(numArray[i] + "  ");
                result++;
            }
            if (result == 2) {
                break;
            }
        }
    }

    public static void findTwoOdd(int[] numArray) {
        int x = numArray[0];
        for (int i=1; i<numArray.length; i++) {
            x ^= numArray[i];
        }
        int k = (x & (~(x-1)));
        int result_1 = 0;
        int result_2 = 0;
        for (int i=0; i<numArray.length; i++) {
            if ((numArray[i] & k) != 0) {
                result_1 ^= numArray[i];
            } else {
                result_2 ^= numArray[i];
            }
        }
        System.out.println(result_1 + "  " + result_2);
    }
}
