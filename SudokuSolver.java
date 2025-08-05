public class SudokuSolver {
    // for checking the all safe positions
    public boolean isSafe(char[][] board, int row, int col, int n) {
        // row and col
        for(int i=0; i<board.length; i++) {
            if(board[i][col] == (char)(n+'0')) {
                return false;
            }
            if(board[row][col] == (char)(n+'0')) {
                return false;
            }
        }

        // for grid
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;
        for(int i=sr; i<sr+3; i++) {
            for(int j=sc; j<sc+3; j++) {
                if(board[i][j] == (char)(n+'0')) {
                    return false;
                }
            }
        }
        return true;

    }
    public boolean helper(char[][] board, int row, int col) {
        // base case
        if(row == board.length) {
            return true;
        }
        int nrow = row;
        int ncol = col;
        if(col != board.length-1) {
            nrow = row;
            ncol = col+1;
        }
        else {
            nrow = row+1;
            ncol = 0;
        }

        if(board[row][col] != '.') {
            if(helper(board, nrow, ncol)) {
                return true;
            }
        }
        // checking validity
        else {
            for(int i=1; i<=9; i++) {
                if(isSafe(board, row, col, i)) {
                    board[row][col] = (char)(i+'0');
                    if(helper(board, row, col)){
                        return true;
                    } else {
                        board[row][col] = '.';
                    }
                }
            }
        }
        return false; 
    }
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
}
