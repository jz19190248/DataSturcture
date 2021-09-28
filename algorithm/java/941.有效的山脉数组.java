/*
 * @lc app=leetcode.cn id=941 lang=java
 *
 * [941] 有效的山脉数组
 */

// @lc code=start
class Solution {
    public boolean validMountainArray(int[] arr) {
        return function(arr);

    }

    public boolean function(int[] arr) {
        // 方法二，相邻比较,T=O(n)
        // S = O(1)
        int i = 0, N = arr.length - 1;
        while (i < N) {
            if (arr[i] < arr[i + 1]) {
                i++;
            } else {
                break;
            }
        }
        if (i == 0 || i == N) {
            return false;
        }
        while (i < N) {
            if (arr[i] > arr[i + 1]) {
                i++;
            } else {
                return false;
            }
        }
        return true;

    }

}
// @lc code=end
