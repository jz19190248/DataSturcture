import java.net.SocketPermission;
import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=56 lang=java
 *
 * [56] 合并区间
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        quicksort(intervals, 0, intervals.length - 1);
        int i = 0, j = 0;
        while (j < intervals.length) {
            if (intervals[j][1] < intervals[j + 1][0]) {
                intervals[i++] = intervals[j++];
            } else {
                // 这里的处理逻辑是，将j和j+1合并放到j+1中，在下轮处理
                intervals[j + 1][0] = intervals[i][0];
                intervals[j + 1][1] = (intervals[j][1] > intervals[j + 1][1]) ? intervals[j][1] : intervals[j + 1][1];
                j++;
            }
        }
        List<int[]> list = new ArrayList<int[]>();
        int index = 0;
        for (int[] interval : intervals) {
            if (index < i) {
                list.add(interval);
                index++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }

    public void quicksort(int[][] intervals, int low, int high) {
        if (low < high) {
            int point = partition(intervals, low, high);
            quicksort(intervals, low, point - 1);
            quicksort(intervals, point + 1, high);
        }

    }

    int partition(int[][] intervals, int start, int end) {
        int[] temp = intervals[start];
        while (start < end) {
            while (start < end && intervals[end][0] > temp[0])
                end--;
            intervals[start] = intervals[end];
            while (start < end && intervals[start][0] < temp[0])
                start++;
            intervals[end] = intervals[start];
        }
        intervals[start] = temp;
        return start;
    }
}

//// @lc code=end
