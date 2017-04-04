import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
	// variables
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        String firstString = sc.nextLine();
        int[] firstNums = new int[firstString.length()];
        for (int i = 0; i < firstString.length(); i++) {
            firstNums[i] = firstString.charAt(i);
        }
        System.out.print("Enter second number: ");
        String secondString = sc.nextLine();
        int[] secondNums = new int[secondString.length()];
        for (int i = 0; i < secondString.length(); i++) {
            secondNums[i] = secondString.charAt(i);

        }
        int[][] addNums = new int[firstNums.length + secondNums.length][secondNums.length];
        for (int i = 0; i < addNums.length; i++) {
            for (int j = 0; j < secondNums.length; j++) {
                addNums[i][j] = 0;
            }
        }
        int finalLength = firstString.length() + secondString.length();
        int mem = 0;

        for (int i = firstNums.length; i > -1; i++) {
            for (int j = secondNums.length; j > -1; j++) {
                int num = secondNums[j] * firstNums[i];
                mem = num % 10;
                //addNums[i][j] =
            }
        }

    }
}
