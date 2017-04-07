import java.util.Scanner;
import java.util.Stack;

public class Multiplication2 {

    // global variables

    private int[] firstNums;
    private int[] secondNums;
    private int[][] addMatrix;
    private int longestSideLength;
    private Stack<Integer> result;

    public Multiplication2(String strOne , String strTwo ) {

        this.firstNums = new int[strOne.length()];
        this.secondNums = new int[strTwo.length()];

        for (int i = 0; i < firstNums.length; i++) {
            this.firstNums[i] = strOne.charAt(i);
        }

        for (int i = 0; i < secondNums.length; i++) {
            this.secondNums[i] = strTwo.charAt(i);
        }

        this.longestSideLength = firstNums.length + secondNums.length + 1;
        this.addMatrix = new int[this.secondNums.length][this.longestSideLength];

    }




    public static void main(String[] args) {
        // variables
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        String firstString = sc.nextLine();
        System.out.print("Enter second number: ");
        String secondString = sc.nextLine();

        Multiplication2 mult = new Multiplication2(firstString, secondString);

        mult.calc();
        mult.printOut();

        // 2d array of ints to add, [row = secondNums][col = firstNums + secondNums + 1]
        // populate 2d array with 0s

    }

    //
    private void calc() {

    }

    // multiply all digits recursivelly, fill addMatrix
    private void multiplication(int num1, int num2, int mem) {

    }
    // add all columns, fill result to Stack
    private void add(int index, int mem) {

    }

    // print out result from Stack
    private void printOut() {

    }





}
