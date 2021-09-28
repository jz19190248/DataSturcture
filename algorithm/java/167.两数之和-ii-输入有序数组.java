/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */

// @lc code=start
class Solution {
    // 这里是一定有唯一的一个答案的，所以这里 不需要考虑没有答案是两个指针一直打转的情况
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int[] answer = new int[2];
        while (i < j) {
            if (numbers[i] + numbers[j] > target) {
                j--;
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                answer[0] = i + 1;
                answer[1] = j + 1;
                break;
            }
        }
        return answer;
    }
}
// @lc code=end
