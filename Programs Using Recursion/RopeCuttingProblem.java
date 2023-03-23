import java.util.Scanner;

public class RopeCuttingProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of rope: ");
        int ropeLength = scanner.nextInt();
        System.out.print("Enter values for a,b and c: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int numberOfPieces = ropeCutting(ropeLength,a,b,c);
        if (numberOfPieces < 1) {
            System.out.println("The rope of length " + ropeLength + " cannot be cut into pieces such that each piece has length either " + a + " or " + b + " or " + c);
        } else {
            System.out.println("Total number of pieces: " + numberOfPieces);
        }
    }

    public static int ropeCutting(int ropeLength, int a, int b, int c) {
        if (ropeLength == 0) {
            return 0;
        }
        if (ropeLength < 0) {
            return -1;
        }
        int result = Math.max(Math.max(ropeCutting((ropeLength-a),a,b,c),ropeCutting((ropeLength-b),a,b,c)),ropeCutting((ropeLength-c),a,b,c));
        if (result == -1) {
            return -1;
        }
        return (result + 1);
    }
}


