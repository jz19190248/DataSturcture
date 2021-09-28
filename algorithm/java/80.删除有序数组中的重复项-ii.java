/*
 * @lc app=leetcode.cn id=80 lang=java
 *
 * [80] 删除有序数组中的重复项 II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            // if (i == 0 || i == 1 || (nums[i - 2] == nums[i - 1] && nums[j] != nums[i -
            // 1]) || nums[i - 1] != nums[j]) {
            // 这里想得过于复杂，只要nums[i-2]和nums[j]不一样，那么nums[i-1]和nums[j]也一定不一样
            // 所以只需要比较nums[i-2]和nums[j]
            if (i == 0 || i == 1 || nums[i - 2] != nums[j]) {
                nums[i++] = nums[j++];
            } else {
                j++;
            }
        }
        return i;
        // int n = nums.length;
        // if (n < 2) {
        // return n;
        // }
        // int slow = 2;
        // int fast = 2;
        // while (fast < n) {
        // if (nums[slow - 2] != nums[fast]) {
        // nums[slow] = nums[fast];
        // ++slow;
        // }
        // ++fast;
        // }
        // return slow;
    }

}
// @lc code=end
