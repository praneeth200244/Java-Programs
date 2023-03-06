import java.util.Scanner;

public class OneOddOccurring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] numArray = new int[n];
        for (int i=0; i<numArray.length; i++) {
            numArray[i] = scanner.nextInt();
        }
        System.out.println("One odd occurring element is " + oneOddOccurring(numArray));
        System.out.println("One odd occurring element is (by efficient method) " + findOneOdd(numArray));
    }

    public static int oneOddOccurring(int[] numArray) {
        int i;
        for (i=0; i<numArray.length; i++) {
            int count = 0;
            for (int j=0; j<numArray.length; j++) {
                if (numArray[i] == numArray[j]) {
                    count++;
                }
            }
            if ((count % 2) != 0) {
                break;
            }
        }
        return (numArray[i]);
    }

    public static int findOneOdd(int[] numArray) {
        int result = numArray[0];
        for (int i=1; i<numArray.length; i++) {
            result ^= numArray[i];
        }
        return result;
    }
}
