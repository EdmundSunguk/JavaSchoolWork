package lab10;

import java.util.Scanner;

public class Square {

    int[][] square;
    
    public Square(int size) {
        square = new int[size][size];
    }
    
    public int sumRow(int row) {
        int[] rowNum = square[row];
        int sum = 0;
        for (int i = 0; i < rowNum.length; i++) {
            sum += rowNum[i];
        }
        return sum;
    }
    
    public int sumCol(int col) {
        int[] colNum = new int[square.length];
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            colNum[i] = square[i][col];
            sum += colNum[i];
        }
        return sum;
    }
    
    public int sumMainDiag() {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[i][i];
        }
        return sum;
    }
    
    public int sumOtherDiag() {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[i][square.length-i];
        }
        return sum;
    }
    
    public boolean magic() {
        for (int i = 0; i < square.length; i++) {
            if (square[i][i] == square[i][square.length-i]
                    && square[square.length-i][i]==square[i][square.length-i]
                    && square[i][i] == square[square.length-i][i]) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
    
    public void readSquare(Scanner scan) {
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                square[row][col] = scan.nextInt();
            }
        }
    }
    
    public void printSquare() {
        for (int[] num : square) {
            for (int numnum : num) {
            System.out.println(numnum);
            }
        }
    }
    
}
