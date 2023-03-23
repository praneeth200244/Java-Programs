import java.util.Scanner;

public class SubsetGeneration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String s = scanner.nextLine();
        String startString = "";
        subsetGeneration(s,startString,0);
    }

    public static void subsetGeneration(String s, String current, int index) {
        if (index == s.length()) {
            System.out.println(current);
            return;
        }
        subsetGeneration(s, current,index+1);
        subsetGeneration(s, current+s.charAt(index), index+1);
    }
}
