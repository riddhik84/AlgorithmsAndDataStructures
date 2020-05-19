//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/769/

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] sudoku = {
                {'3', '5', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '5', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println("Is Valid Sudoku : " + isValidSudoku(sudoku));
    }

    public static boolean isValidSudoku(char[][] board) {
        if (board == null || board.length < 9 || board[0].length < 9) {
            return false;
        }
        //check rows
        for (int i = 0; i < board.length; i++) {
            boolean[] numbers = new boolean[10];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') { //[r][c] increase row when column needs to be printed
                    int n = Integer.parseInt(String.valueOf(board[i][j]));
                    //System.out.print(board[j][i] + " ");
                    if (numbers[n] == true) {
                        return false;
                    }
                    numbers[n] = true;
                }
            }
            //System.out.println();
        }

        //check columns
        for (int i = 0; i < board.length; i++) {
            boolean[] numbers = new boolean[10];
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') { //[r][c] increase row when column needs to be printed
                    int n = Integer.parseInt(String.valueOf(board[j][i]));
                    //System.out.print(board[j][i] + " ");
                    if (numbers[n] == true) {
                        return false;
                    }
                    numbers[n] = true;
                }
            }
            //System.out.println();
        }
        //check 3x3 matrix
        for (int block = 0; block < 9; block++) {
            boolean[] numbers = new boolean[10];
            for (int i = block / 3 * 3; i < block / 3 * 3 + 3; i++) {
                for (int j = block % 3 * 3; j < block % 3 * 3 + 3; j++) {
                    if (board[j][i] != '.') { //[r][c] increase row when column needs to be printed
                        int n = Integer.parseInt(String.valueOf(board[j][i]));
                        //System.out.print(board[j][i] + " ");
                        if (numbers[n] == true) {
                            return false;
                        }
                        numbers[n] = true;
                    }
                }
            }
        }
        return true;
    }
}
