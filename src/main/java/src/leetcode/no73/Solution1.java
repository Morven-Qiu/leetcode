package src.leetcode.no73;


import java.util.Arrays;

/**
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * [
 * [1,1,1],
 * [1,0,1],
 * [1,1,1]
 * ]
 * Output:
 * [
 * [1,0,1],
 * [0,0,0],
 * [1,0,1]
 * ]
 * Example 2:
 * <p>
 * Input:
 * [
 * [0,1,2,0],
 * [3,4,5,2],
 * [1,3,1,5]
 * ]
 * Output:
 * [
 * [0,0,0,0],
 * [0,4,5,0],
 * [0,3,1,0]
 * ]
 * Follow up:
 * <p>
 * A straight forward solution using O(mn) space is probably a bad idea.
 * A simple improvement uses O(m + n) space, but still not the best solution.
 * Could you devise a constant space solution?
 */
public class Solution1 {

    public void setZeroes(int[][] matrix) {
        boolean rowZero = false, colZero = false;
        int row = matrix.length, col = matrix[0].length;
        //judge first row
        for (int i = 0; i < row; i++) {
            if (matrix[i][0] == 0) {
                rowZero = true;
                break;
            }
        }
        //judge first col
        for (int i = 0; i < col; i++) {
            if (matrix[0][i] == 0) {
                colZero = true;
                break;
            }
        }
        //judge zero except first row ,col
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (rowZero) {
            for (int i = 0; i < row; i++) {
                matrix[i][0] = 0;
            }
        }

        if (colZero) {
            for (int i = 0; i < col; i++) {
                matrix[0][i] = 0;
            }
        }

    }


    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 0, 1}, {1, 6, 5}};
        solution1.setZeroes(matrix);
        for(int i = 0 ;i < matrix.length ; i++){
            System.out.println("args = [" + Arrays.toString(matrix[i]) + "]");
        }


    }
}
