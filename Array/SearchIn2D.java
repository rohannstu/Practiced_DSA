class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row_len = matrix.length;
        int col_len  = matrix[0].length;
        int left = 0, right = (row_len * col_len) - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            int row = mid / col_len;
            int col = mid % col_len;
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return false;
    }
}