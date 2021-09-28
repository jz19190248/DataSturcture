/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        //同向双指针挑选，T=O(n)
        //S = O(1)
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[j] != 0) {
                nums[i++] = nums[j++];
            } else {
                j++;
            }
        }
        for (; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
// @lc code=end
