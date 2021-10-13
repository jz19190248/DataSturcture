/*
 * @lc app=leetcode.cn id=48 lang=java
 *
 * [48] 旋转图像
 */

// @lc code=start
class Solution {

    public void rotate(int[][] matrix) {
        // 方法1：规律发现第i行的第j个位置，旋转以后
        // 会到倒数第i列的第j个位置
        // 借助辅助数组进行操作
        // 空间为n^2，时间为n^2
        int row = matrix.length;
        int col = matrix[0].length;
        // int[][] tempMatrix = new int[matrix.length][matrix[0].length];
        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < col; j++) {
        // tempMatrix[j][col - i - 1] = matrix[i][j];
        // }
        // }
        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < col; j++) {
        // matrix[i][j] = tempMatrix[i][j];
        // }
        // }

        // 方法二，首先水平翻转、而后沿对角线翻转，
        // 对二维矩阵的处理中，方法是带入row、col等未知数
        // 而后进对未知数进行计算。
        // 熟悉各种矩阵操作中的角标变化

        // 水平翻转 !!!!!只需要翻转1/2
        int temp = 0;
        for (int i = 0; i < row / 2; i++) {
            for (int j = 0; j < col; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[row - i - 1][j];
                matrix[row - i - 1][j] = temp;
            }
        }
        // 对角线翻转

        for (int i = 0; i < row; i++) {
            for (int j = i; j < col; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }
}
// @lc code=end
