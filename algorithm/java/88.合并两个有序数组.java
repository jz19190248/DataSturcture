/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /*
         * 同向双指针 //T=O(m+n) //S=O(m+n) int i = 0, j = 0, s = 0; int[] result = new int[m
         * + n]; while (i < m && j < n) { if (nums1[i] < nums2[j]) { result[s++] =
         * nums1[i++]; } else { result[s++] = nums2[j++]; } } while (i < m) {
         * result[s++] = nums1[i++]; } while (j < n) { result[s++] = nums2[j++]; } //
         * atention! 需要将自己新的数组拷贝到nums1中，注意审题； for (int x = 0; x < m + n; x++) { nums1[x]
         * = result[x]; }
         */
        /*
         * 方法2，逆向双指针,将合并的数组放到nums1后边的多余的数组 中，这样就降低了空间复杂度，S=O(1),T=O(n)
         */
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (i >= 0) {
            nums1[k--] = nums1[i--];
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
// @lc code=end