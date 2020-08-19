package src.leetcode.no807;

import src.leetcode.no669.Solution;

/**
 * @author fhqiu
 * @since 2020-08-19 14:27
 */
public class Solution1 {

    public static void main(String[] args) {
        int[][] array = {{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};

        Solution1 solution1 = new Solution1();

        System.out.println(solution1.maxIncreaseKeepingSkyline(array));
    }


    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] left = new int[grid.length];
        int[] top = new int[grid.length];
        for(int i = 0 ;i < grid.length;i++){
            int tmp = 0;
            int tmp1 = 1;
            for(int j= 0; j< grid[i].length;j++){
                if(grid[i][j] > tmp){
                    tmp = grid[i][j];
                }

                if(grid[j][i] > tmp1){
                    tmp1 = grid[j][i];
                }

            }
            if(grid.length > i){
                left[i] = tmp;
                top[i] = tmp1;
            }
        }

        int result = 0 ;
        for(int i = 0 ;i < grid.length;i++){
            for(int j= 0; j< grid[i].length;j++){
                int a =  left[i]  > top[j] ?top[j] :  left[i];
                if(a > grid[i][j]){
                    result =  result + a -grid[i][j];
                }

            }
        }
        return result;
    }
}
