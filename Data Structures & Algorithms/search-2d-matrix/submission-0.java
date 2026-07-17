class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int up = 0;
        int down = matrix.length - 1;
        int row = -1;

        // Find the correct row
        while (up <= down) {
            int mid = up + (down - up) / 2;

            if (matrix[mid][0] <= target &&
                matrix[mid][matrix[0].length - 1] >= target) {
                row = mid;
                break;
            } else if (matrix[mid][0] > target) {
                down = mid - 1;
            } else {
                up = mid + 1;
            }
        }

        if (row == -1)
            return false;

        int l = 0;
        int r = matrix[0].length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (matrix[row][mid] == target)
                return true;
            else if (matrix[row][mid] > target)
                r = mid - 1;
            else
                l = mid + 1;
        }

        return false;
    }
}