import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=1260 lang=java
 *
 * [1260] 二维网格迁移
 */

// @lc code=start
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        // 方法1，将二维的数组转存到一维数组中，然后旋转处理后再放到二维数组中；
        // T = O(n*m)
        // S = O(n*m)
        int m = grid.length;
        int n = grid[0].length;
        int[] temp = new int[n * m];
        for (int gi = 0; gi < m; gi++) {
            for (int gj = 0; gj < n; gj++) {
                temp[gi * n + gj] = grid[gi][gj];
            }
        }

        // 循环一维数组
        k %= (m * n);
        reverse(temp, 0, m * n - 1);
        reverse(temp, 0, k - 1);
        reverse(temp, k, m * n - 1);

        List<List<Integer>> result = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(temp[index++]);
            }
            result.add(row);
        }

        /*
         * List<Integer> row = new ArrayList<>();
         * 
         * for (int i = 0; i < m * n; i++) { row.add(temp[i++]); if (i % n == 0) {
         * result.add(row); row.clear(); }
         * 
         * 这段代码反复出错，原因就是因为clear使用不当，有时候，不断出现 未知错误时，把握不清就愿意生成新的空间 }
         */
        return result;

        // ====================================
        // 方法二：模拟迁移
        //// for (; k > 0; k--) {
        //// int[][] newGrid = new int[grid.length][grid[0].length];
        //// for (int row = 0; row < grid.length; row++) {
        //// for (int col = 0; col < grid[0].length - 1; col++) {
        //// newGrid[row][col + 1] = grid[row][col];
        //// }
        //// }
        //// for (int row = 0; row < grid.length - 1; row++) {
        //// newGrid[row + 1][0] = grid[row][grid[0].length - 1];
        //// }
        //// newGrid[0][0] = grid[grid.length - 1][grid[0].length - 1];
        //// grid = newGrid;
        //// }
        //// List<List<Integer>> result = new ArrayList<>();
        //// for (int[] row : grid) {
        //// List<Integer> rowList = new ArrayList<>();
        //// result.add(rowList);
        //// for (int v : row) {
        //// rowList.add(v);
        //// }
        //// }
        //// return result;

        // ================================================
        // 方法三，原地模拟 迁移
        // for (; k > 0; k--) {
        // int previous = grid[grid.length - 1][grid[0].length - 1];
        // for (int row = 0; row < grid.length; row++) {
        // for (int col = 0; col < grid[0].length; col++) {
        // int temp = grid[row][col];
        // grid[row][col] = previous;
        // previous = temp;
        // }
        // }
        // }
        // List<List<Integer>> result = new ArrayList<>();
        // for (int[] row : grid) {
        // List<Integer> rowList = new ArrayList<>();
        // result.add(rowList);// 这里为什么会是这样的顺序呢？
        // for (int v : row) {
        // rowList.add(v);
        // }
        // }
        // return result;
    }

    public void reverse(int[] nums, int start, int end) {
        // int i = 0, j = nums.length - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
// @lc code=end
