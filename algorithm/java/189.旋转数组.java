/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 旋转数组
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        /*
         * 方法一，通过取模运算获得结果； 时间复杂度O（n） 空间复杂度O(n) int n = nums.length; int[] newArray = new
         * int[n]; for(int i = 0 ; i < n ;i++){ newArray[(i+k)%n] = nums[i]; }
         * System.arraycopy(newArray, 0, nums, 0, n);
         */
        /* 方法2，数组三次旋转 ,时间复杂度O(n),空间复杂都O(1) */
        k %= nums.length;// 考虑到k值大于数组长度时的问题
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
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
