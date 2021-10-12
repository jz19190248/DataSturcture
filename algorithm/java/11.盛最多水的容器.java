/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    // 这道题双指针编码的时候写起来简单，但是想到双指针，以及双指针移动规则却比较难
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int area = 0;
        while (low < high) {
            int minheight = height[low] >= height[high] ? height[high] : height[low];
            if (minheight * (high - low) > area)
                area = minheight * (high - low);
            if (height[low] < height[high]) {
                low++;
            } else {
                high--;
            }
        }
        return area;

    }
}
// @lc code=end
