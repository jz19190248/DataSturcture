/*
 * @lc app=leetcode.cn id=75 lang=java
 *
 * [75] 颜色分类
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        // 这是数据结构考研题目荷兰国旗改编
        int temp = 0;
        int i = 0, j = 0, k = nums.length - 1;
        for (j = i; j <= k;) {
            if (nums[j] == 0) {
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j++;
            } else if (nums[j] == 2) {
                temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                k--;
            } else {
                j++;
            }
        }
    }
}
// @lc code=end
