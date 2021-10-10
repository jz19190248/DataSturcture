import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;

/*
 * @lc app=leetcode.cn id=215 lang=java
 *
 * [215] 数组中的第K个最大元素
 */

// @lc code=start
class Solution {
    private void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public int fun1_myselfBubbleSort(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            boolean flag = false;
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j - 1] < nums[j]) {
                    swap(nums[j], nums[j - 1]);
                    // int temp = nums[j];
                    // nums[j] = nums[j + 1];
                    // nums[j + 1] = temp;
                    flag = true;
                }
                if (!flag)
                    break;

            }
        }
        for (int i = 0; i < nums.length; i++)
            System.out.println(nums[i] + "  ");
        return nums[k - 1];
    }

    // =====================================================
    public int fun2_sort(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
    // ========================================================

    private int Partition(int[] nums, int low, int high) {
        // 由于测试用例中的极端用例，所以这里的枢轴最好不要选择第一个
        // 而是选择后边的一个任意值
        // int randomindex = low + 1 + Random.nextInt(high - low);
        int point = nums[low];
        while (low < high) {
            while (low < high && nums[high] >= point)
                high--;
            nums[low] = nums[high];
            while (low < high && nums[low] <= point)
                low++;
            nums[high] = nums[low];
        }
        nums[low] = point;
        return low;
    }

    public int fun3_Parttion(int[] nums, int k) {
        int len = nums.length;
        int low = 0;
        int high = len - 1;
        int target = len - k;
        while (true) {
            int index = Partition(nums, low, high);
            if (index == target)
                return nums[index];
            else if (index < target) {
                low = index + 1;
            } else {
                high = index - 1;
            }
        }
    }
    // =======================================================

    public int fun4_Priority(int[] nums, int k) {
        // 思路：把最大的K个元素都放入队列中，小顶堆的顶部是最小的，那么就是第k大个元素

        // 执行的操作位。若堆中的数小于K，则直接添加，如果大于K，则遍历到一个大于堆顶的就将其入队；

        int len = nums.length;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k, (a, b) -> a - b);
        for (int i = 0; i < k; i++) {
            minHeap.add(nums[i]);
        }
        for (int i = k; i < len; i++) {
            Integer topElm = minHeap.peek();
            if (nums[i] > topElm) {
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }
        return minHeap.peek();
    }

    // =========================================================
    public int fun5_midSearch(int[] nums, int k) {
        int l = (int) -1E+4, r = (int) 1E+4;
        while (l < r - 1) {
            int mid = l + (r - l) / 2;
            int greaterEq = countGreaterEq(nums, mid);
            if (greaterEq >= k) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return countGreaterEq(nums, r) >= k ? r : l;
    }

    private int countGreaterEq(int nums[], int tar) {
        int cnt = 0;
        for (int i : nums) {
            if (i >= tar) {
                ++cnt;
            }
        }
        return cnt;
    }

    public int findKthLargest(int[] nums, int k) {
        // return fun1_myselfBubbleSort(nums, k);
        // return fun2_sort(nums, k);
        // return fun3_Parttion(nums, k);
        // return fun4_Priority(nums, k);
        return fun5_midSearch(nums, k);
    }
}
// @lc code=end
