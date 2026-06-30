class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Traverse every cell on the 9x9 board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // If the cell contains a digit, validate it
                if (board[i][j] != '.') {
                    char num = board[i][j];
                    
                    // Temporarily clear the cell so it doesn't match against itself
                    board[i][j] = '.';
                    
                    // Check if 'num' is valid at position (i, j)
                    if (!isValid(board, i, j, num)) {
                        return false;
                    }
                    
                    // Restore the cell value
                    board[i][j] = num;
                }
            }
        }
        return true;
    }

    // takeUforward Single Loop Box Check Condition
    private boolean isValid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            // 1. Check the entire column
            if (board[i][col] == c) return false;
            
            // 2. Check the entire row
            if (board[row][i] == c) return false;
            
            // 3. Check the 3x3 sub-box using a single loop
            int boxRow = 3 * (row / 3) + i / 3;
            int boxCol = 3 * (col / 3) + i % 3;
            if (board[boxRow][boxCol] == c) return false;
        }
        return true;
    }
}
