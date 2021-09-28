/*
 * @lc app=leetcode.cn id=344 lang=java
 *
 * [344] 反转字符串
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        /*
         * for (int i = 0; i < s.length; i++) { for (int j = s.length - 1; j > 0; j--) {
         * if (i < j) { char temp = s[i]; s[i] = s[j]; s[j] = temp; } } }
         */
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
// @lc code=end
