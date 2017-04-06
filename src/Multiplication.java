import java.util.Scanner;
import java.util.Stack;

public class Multiplication {

    public static void main(String[] args) {
	// variables
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        String firstString = sc.nextLine();
        int[] firstNums = new int[firstString.length()];
        for (int i = 0; i < firstString.length(); i++) {
            firstNums[i] = Character.getNumericValue(firstString.charAt(i));
        }

        System.out.print("Enter second number: ");
        String secondString = sc.nextLine();
        int[] secondNums = new int[secondString.length()]; // length equals to rows
        for (int i = 0; i < secondString.length(); i++) {
            secondNums[i] = Character.getNumericValue(secondString.charAt(i));
        }

	// 2d array of ints to add, [row = secondNums][col = firstNums + secondNums + 1]
	// populate 2d array with 0s
		int longestSide = firstNums.length + secondNums.length + 1;
        int[][] addNums = new int[secondNums.length][longestSide]; 
//        for (int i = 0; i < secondNums.length; i++) {
//            for (int j = 0; j < longestSide - 1; j++) {
//                addNums[i][j] = 0;
//            }
//        }

        int mem = 0;
		
		// perform multiplication
        for (int i = secondNums.length - 1; i >= 0; i--) {
			int k = longestSide - (secondNums.length - i); // index for addNums long side with shift from right side
			mem = 0;
            for (int j = firstNums.length - 1; j >= 0; j--) {
                int num = secondNums[i] * firstNums[j] + mem;
                mem = num / 10;
                num = num % 10;
				addNums[i][k--] = num;
				if (j == 0 && mem > 0) {
					addNums[i][k] = mem;					
				}                 
            }
        }
		
		Stack<Integer> result = new Stack<Integer>();
		
		// perform addition

        int num = 0;

		for (int j = longestSide - 1; j >= 0; j--) {
            mem = 0;
            num = 0;
            for (int i = 0; i < secondNums.length; i++) {
				num = num + addNums[i][j];
			}

            mem = num / 10;
            num = num % 10 + mem;
            if (num > 9) {

                mem = num / 10;
                num = num % 10;

            }
            result.push(num);
        }
		
		// print result
		while (result.equals(0)) {
			result.pop();
		}
		
		while (!result.isEmpty()) {
			System.out.print(result.pop());
		}
    }
}
