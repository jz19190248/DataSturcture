# Two Pointers

[TOC]

![image-20210918185833675](1Array.assets\image-20210918185833675.png)





## 模板

### Two Pointers 同向模板

![image-20210918185922127](1Array.assets\image-20210918185922127.png)

### Two Pointers 反向模板

![image-20210918192103193](1Array.assets\image-20210918192103193.png)

## 例题

### 题目列表

| Classic Problems                                             |
| ------------------------------------------------------------ |
| 189. Rotate Array                                            |
| 88. Merge Sorted Array                                       |
| 1260. Shift 2D Grid                                          |
| 941. Valid Mountain Array                                    |
| 283. Move Zeros                                              |
| 167. Two Sum II – Input array is sorted                      |
| 80. Remove Duplicates from Sorted Array II                   |
| 56. Merge Intervals                                          |
| 11. Container With Most Water                                |
| [31. Next Permuation](https://turingplanet.org/2020/12/28/31_next_permutation/) |
| 442. Find All Duplicates in an Array                         |
| 48. Rotate Image                                             |
| 75. Sort Colors                                              |
| 57. Insert Interval                                          |
| 42. Trapping Rain Water                                      |

#### 344.反转字符串

> # [344.反转字符串](https://leetcode-cn.com/problems/reverse-string/description/)
>
> |  Category  |  Difficulty   | Likes | Dislikes |
> | :--------: | :-----------: | :---: | :------: |
> | algorithms | Easy (76.72%) |  457  |    -     |
>
> <details><summary><strong>Tags</strong></summary></details>
>
> <details><summary><strong>Companies</strong></summary></details>
>
> 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
>
> 示例 1：输入：["h","e","l","l","o"]
> 输出：["o","l","l","e","h"]
>
> 
>
> 示例 2：输入：["H","a","n","n","a","h"]
> 输出：["h","a","n","n","a","H"]
>
> ```java
> /*
>  * @lc app=leetcode.cn id=344 lang=java
>  *
>  * [344] 反转字符串
>  */
> 
> // @lc code=start
> class Solution {
>     public void reverseString(char[] s) {
>         int i = 0;
>         int j = s.length - 1;
>         while (i < j) {
>             char temp = s[i];
>             s[i] = s[j];
>             s[j] = temp;
>             i++;
>             j--;
>         }
>     }
> }
> // @lc code=end
> ```
>
> 

#### 26.删除有序数组中的重复项

># [26.删除有序数组中的重复项](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/description/)
>
>|  Category  |  Difficulty   | Likes | Dislikes |
>| :--------: | :-----------: | :---: | :------: |
>| algorithms | Easy (53.98%) | 2219  |    -     |
>
><details style="color: rgb(212, 212, 212); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe WPC&quot;, &quot;Segoe UI&quot;, system-ui, Ubuntu, &quot;Droid Sans&quot;, sans-serif, &quot;Microsoft Yahei UI&quot;; font-size: 14px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary><strong>Tags</strong></summary></details>
>
><details style="color: rgb(212, 212, 212); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe WPC&quot;, &quot;Segoe UI&quot;, system-ui, Ubuntu, &quot;Droid Sans&quot;, sans-serif, &quot;Microsoft Yahei UI&quot;; font-size: 14px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary><strong>Companies</strong></summary></details>
>
>给你一个有序数组 `nums` ，请你**[ 原地](http://baike.baidu.com/item/原地算法)** 删除重复出现的元素，使每个元素 **只出现一次** ，返回删除后数组的新长度。
>
>不要使用额外的数组空间，你必须在 **[原地 ](https://baike.baidu.com/item/原地算法)修改输入数组** 并在使用 O(1) 额外空间的条件下完成。
>
> 
>
>**说明:**
>
>为什么返回数值是整数，但输出的答案是数组呢?
>
>请注意，输入数组是以**「引用」**方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
>
>你可以想象内部操作如下:
>
>```
>// nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
>int len = removeDuplicates(nums);
>
>// 在函数里修改输入数组对于调用者是可见的。
>// 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
>for (int i = 0; i < len; i++) {
>    print(nums[i]);
>}
>```
>
> 
>
>**示例 1：**
>
>```
>输入：nums = [1,1,2]
>输出：2, nums = [1,2]
>解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。
>```
>
>**示例 2：**
>
>```
>输入：nums = [0,0,1,1,1,2,2,3,3,4]
>输出：5, nums = [0,1,2,3,4]
>解释：函数应该返回新的长度 5 ， 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4 。不需要考虑数组中超出新长度后面的元素。
>```
>
> 
>
>**提示：**
>
>- `0 <= nums.length <= 3 * 104`
>- `-104 <= nums[i] <= 104`
>- `nums` 已按升序排列
>
>```java
>/*
> * @lc app=leetcode.cn id=26 lang=java
> *
> * [26] 删除有序数组中的重复项
> */
>
>// @lc code=start
>class Solution {
>    public int removeDuplicates(int[] nums) {
>        int i = 0, j = 0;
>        while (j < nums.length) {
>            if (i == 0 || nums[j] != nums[i - 1]) {
>                nums[i++] = nums[j++];
>            } else {
>                j++;
>            }
>        }
>        return i;
>    }
>}
>// @lc code=end
>```

#### 189.旋转数组

># [189.旋转数组](https://leetcode-cn.com/problems/rotate-array/description/)
>
>|  Category  |   Difficulty    | Likes | Dislikes |
>| :--------: | :-------------: | :---: | :------: |
>| algorithms | Medium (45.15%) | 1126  |    -     |
>
><details style="color: rgb(212, 212, 212); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe WPC&quot;, &quot;Segoe UI&quot;, system-ui, Ubuntu, &quot;Droid Sans&quot;, sans-serif, &quot;Microsoft Yahei UI&quot;; font-size: 14px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary><strong>Tags</strong></summary></details>
>
><details style="color: rgb(212, 212, 212); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe WPC&quot;, &quot;Segoe UI&quot;, system-ui, Ubuntu, &quot;Droid Sans&quot;, sans-serif, &quot;Microsoft Yahei UI&quot;; font-size: 14px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary><strong>Companies</strong></summary></details>
>
>给定一个数组，将数组中的元素向右移动 `k` 个位置，其中 `k` 是非负数。
>
> 
>
>**进阶：**
>
>- 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
>- 你可以使用空间复杂度为 O(1) 的 **原地** 算法解决这个问题吗？
>
> 
>
>**示例 1:**
>
>```
>输入: nums = [1,2,3,4,5,6,7], k = 3
>输出: [5,6,7,1,2,3,4]
>解释:
>向右旋转 1 步: [7,1,2,3,4,5,6]
>向右旋转 2 步: [6,7,1,2,3,4,5]
>向右旋转 3 步: [5,6,7,1,2,3,4]
>```
>
>**示例 2:**
>
>```
>输入：nums = [-1,-100,3,99], k = 2
>输出：[3,99,-1,-100]
>解释: 
>向右旋转 1 步: [99,-1,-100,3]
>向右旋转 2 步: [3,99,-1,-100]
>```
>
> 
>
>**提示：**
>
>- `1 <= nums.length <= 2 * 104`
>
>- `-231 <= nums[i] <= 231 - 1`
>
>- `0 <= k <= 105`
>
>  ```java
>  /*
>   * @lc app=leetcode.cn id=189 lang=java
>   *
>   * [189] 旋转数组
>   */
>  
>  // @lc code=start
>  class Solution {
>      public void rotate(int[] nums, int k) {
>          /*
>           * 方法一，通过取模运算获得结果； 时间复杂度O（n） 空间复杂度O(n) int n = nums.length; int[] newArray = new
>           * int[n]; for(int i = 0 ; i < n ;i++){ newArray[(i+k)%n] = nums[i]; }
>           * System.arraycopy(newArray, 0, nums, 0, n);
>           */
>          /* 方法2，数组三次旋转 ,时间复杂度O(n),空间复杂都O(1) */
>          k %= nums.length;// 考虑到k值大于数组长度时的问题
>          reverse(nums, 0, nums.length - 1);
>          reverse(nums, 0, k - 1);
>          reverse(nums, k, nums.length - 1);
>      }
>  
>      public void reverse(int[] nums, int start, int end) {
>          while (start < end) {
>              int temp = nums[start];
>              nums[start] = nums[end];
>              nums[end] = temp;
>              start++;
>              end--;
>          }
>      }
>  }
>  // @lc code=end
>  ```

#### 88.合并两个有序数组

># [88.合并两个有序数组](https://leetcode-cn.com/problems/merge-sorted-array/description/)
>
>|  Category  |  Difficulty   | Likes | Dislikes |
>| :--------: | :-----------: | :---: | :------: |
>| algorithms | Easy (51.63%) | 1107  |    -     |
>
><details style="color: rgb(212, 212, 212); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe WPC&quot;, &quot;Segoe UI&quot;, system-ui, Ubuntu, &quot;Droid Sans&quot;, sans-serif, &quot;Microsoft Yahei UI&quot;; font-size: 14px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary><strong>Tags</strong></summary></details>
>
><details style="color: rgb(212, 212, 212); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe WPC&quot;, &quot;Segoe UI&quot;, system-ui, Ubuntu, &quot;Droid Sans&quot;, sans-serif, &quot;Microsoft Yahei UI&quot;; font-size: 14px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary><strong>Companies</strong></summary></details>
>
>给你两个按 **非递减顺序** 排列的整数数组 `nums1` 和 `nums2`，另有两个整数 `m` 和 `n` ，分别表示 `nums1` 和 `nums2` 中的元素数目。
>
>请你 **合并** `nums2` 到 `nums1` 中，使合并后的数组同样按 **非递减顺序** 排列。
>
>**注意：**最终，合并后数组不应由函数返回，而是存储在数组 `nums1` 中。为了应对这种情况，`nums1` 的初始长度为 `m + n`，其中前 `m` 个元素表示应合并的元素，后 `n` 个元素为 `0` ，应忽略。`nums2` 的长度为 `n` 。
>
> 
>
>**示例 1：**
>
>```
>输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
>输出：[1,2,2,3,5,6]
>解释：需要合并 [1,2,3] 和 [2,5,6] 。
>合并结果是 [1,2,2,3,5,6] ，其中斜体加粗标注的为 nums1 中的元素。
>```
>
>**示例 2：**
>
>```
>输入：nums1 = [1], m = 1, nums2 = [], n = 0
>输出：[1]
>解释：需要合并 [1] 和 [] 。
>合并结果是 [1] 。
>```
>
>**示例 3：**
>
>```
>输入：nums1 = [0], m = 0, nums2 = [1], n = 1
>输出：[1]
>解释：需要合并的数组是 [] 和 [1] 。
>合并结果是 [1] 。
>注意，因为 m = 0 ，所以 nums1 中没有元素。nums1 中仅存的 0 仅仅是为了确保合并结果可以顺利存放到 nums1 中。
>```
>
> 
>
>**提示：**
>
>- `nums1.length == m + n`
>- `nums2.length == n`
>- `0 <= m, n <= 200`
>- `1 <= m + n <= 200`
>- `-109 <= nums1[i], nums2[j] <= 109`
>
> 
>
>**进阶：**你可以设计实现一个时间复杂度为 `O(m + n)` 的算法解决此问题吗？
>
>```java
>/*
> * @lc app=leetcode.cn id=88 lang=java
> *
> * [88] 合并两个有序数组
> */
>
>// @lc code=start
>class Solution {
>
>    public void merge(int[] nums1, int m, int[] nums2, int n) {
>        /*
>         * 同向双指针 //T=O(m+n) //S=O(m+n) int i = 0, j = 0, s = 0; int[] result = new int[m
>         * + n]; while (i < m && j < n) { if (nums1[i] < nums2[j]) { result[s++] =
>         * nums1[i++]; } else { result[s++] = nums2[j++]; } } while (i < m) {
>         * result[s++] = nums1[i++]; } while (j < n) { result[s++] = nums2[j++]; } //
>         * atention! 需要将自己新的数组拷贝到nums1中，注意审题； for (int x = 0; x < m + n; x++) { nums1[x]
>         * = result[x]; }
>         */
>        /*
>         * 方法2，逆向双指针,将合并的数组放到nums1后边的多余的数组 中，这样就降低了空间复杂度，S=O(1),T=O(n)
>         */
>        int i = m - 1;
>        int j = n - 1;
>        int k = m + n - 1;
>        while (i >= 0 && j >= 0) {
>            if (nums1[i] > nums2[j]) {
>                nums1[k--] = nums1[i--];
>            } else {
>                nums1[k--] = nums2[j--];
>            }
>        }
>        while (i >= 0) {
>            nums1[k--] = nums1[i--];
>        }
>        while (j >= 0) {
>            nums1[k--] = nums2[j--];
>        }
>    }
>}
>// @lc code=end
>```

#### 1260.二维网格迁移

># [1260.二维网格迁移](https://leetcode-cn.com/problems/shift-2d-grid/description/)
>
>|  Category  |  Difficulty   | Likes | Dislikes |
>| :--------: | :-----------: | :---: | :------: |
>| algorithms | Easy (60.45%) |  46   |    -     |
>
><details style="color: rgb(212, 212, 212); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe WPC&quot;, &quot;Segoe UI&quot;, system-ui, Ubuntu, &quot;Droid Sans&quot;, sans-serif, &quot;Microsoft Yahei UI&quot;; font-size: 14px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary><strong>Tags</strong></summary></details>
>
><details style="color: rgb(212, 212, 212); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe WPC&quot;, &quot;Segoe UI&quot;, system-ui, Ubuntu, &quot;Droid Sans&quot;, sans-serif, &quot;Microsoft Yahei UI&quot;; font-size: 14px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary><strong>Companies</strong></summary></details>
>
>给你一个 `m` 行 `n` 列的二维网格 `grid` 和一个整数 `k`。你需要将 `grid` 迁移 `k` 次。
>
>每次「迁移」操作将会引发下述活动：
>
>- 位于 `grid[i][j]` 的元素将会移动到 `grid[i][j + 1]`。s
>- 位于 `grid[i][n - 1]` 的元素将会移动到 `grid[i + 1][0]`。
>- 位于 `grid[m - 1][n - 1]` 的元素将会移动到 `grid[0][0]`。
>
>请你返回 `k` 次迁移操作后最终得到的 **二维网格**。
>
>
>
>**示例 1：**
>
>![img](1Array.assets\e1-1.png)
>
>```
>输入：grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
>输出：[[9,1,2],[3,4,5],[6,7,8]]
>```
>
>**示例 2：**
>
>![img](1Array.assets\e2-1.png)
>
>```
>输入：grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
>输出：[[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]
>```
>
>**示例 3：**
>
>```
>输入：grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
>输出：[[1,2,3],[4,5,6],[7,8,9]]
>```
>
>
>
>**提示：**
>
>- `m == grid.length`
>
>- `n == grid[i].length`
>
>- `1 <= m <= 50`
>
>- `1 <= n <= 50`
>
>- `-1000 <= grid[i][j] <= 1000`
>
>- `0 <= k <= 100`
>
>  ```java
>  import java.util.ArrayList;
>  import java.util.List;
>  
>  /*
>   * @lc app=leetcode.cn id=1260 lang=java
>   *
>   * [1260] 二维网格迁移
>   */
>  
>  // @lc code=start
>  class Solution {
>      public List<List<Integer>> shiftGrid(int[][] grid, int k) {
>          // 方法1，将二维的数组转存到一维数组中，然后旋转处理后再放到二维数组中；
>          // T = O(n*m)
>          // S = O(n*m)
>          int m = grid.length;
>          int n = grid[0].length;
>          int[] temp = new int[n * m];
>          for (int gi = 0; gi < m; gi++) {
>              for (int gj = 0; gj < n; gj++) {
>                  temp[gi * n + gj] = grid[gi][gj];
>              }
>          }
>  
>          // 循环一维数组
>          k %= (m * n);
>          reverse(temp, 0, m * n - 1);
>          reverse(temp, 0, k - 1);
>          reverse(temp, k, m * n - 1);
>  
>          List<List<Integer>> result = new ArrayList<>();
>          int index = 0;
>          for (int i = 0; i < m; i++) {
>              List<Integer> row = new ArrayList<>();
>              for (int j = 0; j < n; j++) {
>                  row.add(temp[index++]);
>              }
>              result.add(row);
>          }
>  
>          /*
>           * List<Integer> row = new ArrayList<>();
>           * 
>           * for (int i = 0; i < m * n; i++) { row.add(temp[i++]); if (i % n == 0) {
>           * result.add(row); row.clear(); }
>           * 
>           * 这段代码反复出错，原因就是因为clear使用不当，有时候，不断出现 未知错误时，把握不清就愿意生成新的空间 }
>           */
>          return result;
>  
>          // ====================================
>          // 方法二：模拟迁移
>          //// for (; k > 0; k--) {
>          //// int[][] newGrid = new int[grid.length][grid[0].length];
>          //// for (int row = 0; row < grid.length; row++) {
>          //// for (int col = 0; col < grid[0].length - 1; col++) {
>          //// newGrid[row][col + 1] = grid[row][col];
>          //// }
>          //// }
>          //// for (int row = 0; row < grid.length - 1; row++) {
>          //// newGrid[row + 1][0] = grid[row][grid[0].length - 1];
>          //// }
>          //// newGrid[0][0] = grid[grid.length - 1][grid[0].length - 1];
>          //// grid = newGrid;
>          //// }
>          //// List<List<Integer>> result = new ArrayList<>();
>          //// for (int[] row : grid) {
>          //// List<Integer> rowList = new ArrayList<>();
>          //// result.add(rowList);
>          //// for (int v : row) {
>          //// rowList.add(v);
>          //// }
>          //// }
>          //// return result;
>  
>          // ================================================
>          // 方法三，原地模拟 迁移
>          // for (; k > 0; k--) {
>          // int previous = grid[grid.length - 1][grid[0].length - 1];
>          // for (int row = 0; row < grid.length; row++) {
>          // for (int col = 0; col < grid[0].length; col++) {
>          // int temp = grid[row][col];
>          // grid[row][col] = previous;
>          // previous = temp;
>          // }
>          // }
>          // }
>          // List<List<Integer>> result = new ArrayList<>();
>          // for (int[] row : grid) {
>          // List<Integer> rowList = new ArrayList<>();
>          // result.add(rowList);// 这里为什么会是这样的顺序呢？
>          // for (int v : row) {
>          // rowList.add(v);
>          // }
>          // }
>          // return result;
>      }
>  
>      public void reverse(int[] nums, int start, int end) {
>          // int i = 0, j = nums.length - 1;
>          while (start < end) {
>              int temp = nums[start];
>              nums[start] = nums[end];
>              nums[end] = temp;
>              start++;
>              end--;
>          }
>      }
>  }
>  // @lc code=end
>  ```

#### 941.有效的山脉数组

># [941.有效的山脉数组](https://leetcode-cn.com/problems/valid-mountain-array/description/)
>
>|  Category  |  Difficulty   | Likes | Dislikes |
>| :--------: | :-----------: | :---: | :------: |
>| algorithms | Easy (39.24%) |  157  |    -     |
>
><details style="color: rgb(212, 212, 212); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe WPC&quot;, &quot;Segoe UI&quot;, system-ui, Ubuntu, &quot;Droid Sans&quot;, sans-serif, &quot;Microsoft Yahei UI&quot;; font-size: 14px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary><strong>Tags</strong></summary></details>
>
><details style="color: rgb(212, 212, 212); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe WPC&quot;, &quot;Segoe UI&quot;, system-ui, Ubuntu, &quot;Droid Sans&quot;, sans-serif, &quot;Microsoft Yahei UI&quot;; font-size: 14px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary><strong>Companies</strong></summary></details>
>
>给定一个整数数组 `arr`，如果它是有效的山脉数组就返回 `true`，否则返回 `false`。
>
>让我们回顾一下，如果 A 满足下述条件，那么它是一个山脉数组：
>
>- `arr.length >= 3`
>
>- 在 
>
> ```
> 0 < i < arr.length - 1
> ```
>
>  条件下，存在 
>
> ```
> i
> ```
>
>  使得：
>
> - `arr[0] < arr[1] < ... arr[i-1] < arr[i] `
> - `arr[i] > arr[i+1] > ... > arr[arr.length - 1]`
>
>
>
>![img](1Array.assets\hint_valid_mountain_array.png)
>
>
>
>**示例 1：**
>
>```
>输入：arr = [2,1]
>输出：false
>```
>
>**示例 2：**
>
>```
>输入：arr = [3,5,5]
>输出：false
>```
>
>**示例 3：**
>
>```
>输入：arr = [0,3,2,1]
>输出：true
>```
>
>
>
>**提示：**
>
>- `1 <= arr.length <= 104`
>- `0 <= arr[i] <= 104`
>
>```java
>/*
> * @lc app=leetcode.cn id=941 lang=java
> *
> * [941] 有效的山脉数组
> */
>
>// @lc code=start
>class Solution {
>    public boolean validMountainArray(int[] arr) {
>        return function(arr);
>
>    }
>
>    public boolean function(int[] arr) {
>        // 方法二，相邻比较,T=O(n)
>        // S = O(1)
>        int i = 0, N = arr.length - 1;
>        while (i < N) {
>            if (arr[i] < arr[i + 1]) {
>                i++;
>            } else {
>                break;
>            }
>        }
>        if (i == 0 || i == N) {
>            return false;
>        }
>        while (i < N) {
>            if (arr[i] > arr[i + 1]) {
>                i++;
>            } else {
>                return false;
>            }
>        }
>        return true;
>
>    }
>
>}
>// @lc code=end
>```

#### 283.移动零

># [283.移动零](https://leetcode-cn.com/problems/move-zeroes/description/)
>
>|  Category  |  Difficulty   | Likes | Dislikes |
>| :--------: | :-----------: | :---: | :------: |
>| algorithms | Easy (63.83%) | 1232  |    -     |
>
><details style="color: rgb(212, 212, 212); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe WPC&quot;, &quot;Segoe UI&quot;, system-ui, Ubuntu, &quot;Droid Sans&quot;, sans-serif, &quot;Microsoft Yahei UI&quot;; font-size: 14px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary><strong>Tags</strong></summary></details>
>
><details style="color: rgb(212, 212, 212); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe WPC&quot;, &quot;Segoe UI&quot;, system-ui, Ubuntu, &quot;Droid Sans&quot;, sans-serif, &quot;Microsoft Yahei UI&quot;; font-size: 14px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary><strong>Companies</strong></summary></details>
>
>给定一个数组 `nums`，编写一个函数将所有 `0` 移动到数组的末尾，同时保持非零元素的相对顺序。
>
>**示例:**
>
>```
>输入: [0,1,0,3,12]
>输出: [1,3,12,0,0]
>```
>
>**说明**:
>
>1. 必须在原数组上操作，不能拷贝额外的数组。
>2. 尽量减少操作次数。
>
>------
>
>[Discussion](https://leetcode-cn.com/problems/move-zeroes/comments/) | [Solution](https://leetcode-cn.com/problems/move-zeroes/solution/)
>
>```java
>/*
> * @lc app=leetcode.cn id=283 lang=java
> *
> * [283] 移动零
> */
>
>// @lc code=start
>class Solution {
>    public void moveZeroes(int[] nums) {
>        //同向双指针挑选，T=O(n)
>        //S = O(1)
>        int i = 0, j = 0;
>        while (j < nums.length) {
>            if (nums[j] != 0) {
>                nums[i++] = nums[j++];
>            } else {
>                j++;
>            }
>        }
>        for (; i < nums.length; i++) {
>            nums[i] = 0;
>        }
>    }
>}
>// @lc code=end
>```

#### 167.两数之和 II - 输入有序数组

># [167.两数之和 II - 输入有序数组](https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/description/)
>
>|  Category  |  Difficulty   | Likes | Dislikes |
>| :--------: | :-----------: | :---: | :------: |
>| algorithms | Easy (58.65%) |  587  |    -     |
>
><details style="color: rgb(212, 212, 212); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe WPC&quot;, &quot;Segoe UI&quot;, system-ui, Ubuntu, &quot;Droid Sans&quot;, sans-serif, &quot;Microsoft Yahei UI&quot;; font-size: 14px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary><strong>Tags</strong></summary></details>
>
><details style="color: rgb(212, 212, 212); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe WPC&quot;, &quot;Segoe UI&quot;, system-ui, Ubuntu, &quot;Droid Sans&quot;, sans-serif, &quot;Microsoft Yahei UI&quot;; font-size: 14px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary><strong>Companies</strong></summary></details>
>
>给定一个已按照 **非递减顺序排列** 的整数数组 `numbers` ，请你从数组中找出两个数满足相加之和等于目标数 `target` 。
>
>函数应该以长度为 `2` 的整数数组的形式返回这两个数的下标值*。*`numbers` 的下标 **从 1 开始计数** ，所以答案数组应当满足 `1 <= answer[0] < answer[1] <= numbers.length` 。
>
>你可以假设每个输入 **只对应唯一的答案** ，而且你 **不可以** 重复使用相同的元素。
>
> 
>
>**示例 1：**
>
>```
>输入：numbers = [2,7,11,15], target = 9
>输出：[1,2]
>解释：2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
>```
>
>**示例 2：**
>
>```
>输入：numbers = [2,3,4], target = 6
>输出：[1,3]
>```
>
>**示例 3：**
>
>```
>输入：numbers = [-1,0], target = -1
>输出：[1,2]
>```
>
> 
>
>**提示：**
>
>- `2 <= numbers.length <= 3 * 104`
>- `-1000 <= numbers[i] <= 1000`
>- `numbers` 按 **非递减顺序** 排列
>- `-1000 <= target <= 1000`
>- **仅存在一个有效答案**
>
>------
>
>[Discussion](https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/comments/) | [Solution](https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/solution/)
>
>```java
>/*
> * @lc app=leetcode.cn id=167 lang=java
> *
> * [167] 两数之和 II - 输入有序数组
> */
>
>// @lc code=start
>class Solution {
>    // 这里是一定有唯一的一个答案的，所以这里 不需要考虑没有答案是两个指针一直打转的情况
>    public int[] twoSum(int[] numbers, int target) {
>        int i = 0;
>        int j = numbers.length - 1;
>        int[] answer = new int[2];
>        while (i < j) {
>            if (numbers[i] + numbers[j] > target) {
>                j--;
>            } else if (numbers[i] + numbers[j] < target) {
>                i++;
>            } else {
>                answer[0] = i + 1;
>                answer[1] = j + 1;
>                break;
>            }
>        }
>        return answer;
>    }
>}
>// @lc code=end
>```

#### 80.删除有序数组中的重复项 II

># [80.删除有序数组中的重复项 II](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/description/)
>
>|  Category  |   Difficulty    | Likes | Dislikes |
>| :--------: | :-------------: | :---: | :------: |
>| algorithms | Medium (61.64%) |  579  |    -     |
>
><details style="color: rgb(212, 212, 212); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe WPC&quot;, &quot;Segoe UI&quot;, system-ui, Ubuntu, &quot;Droid Sans&quot;, sans-serif, &quot;Microsoft Yahei UI&quot;; font-size: 14px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary><strong>Tags</strong></summary></details>
>
><details style="color: rgb(212, 212, 212); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe WPC&quot;, &quot;Segoe UI&quot;, system-ui, Ubuntu, &quot;Droid Sans&quot;, sans-serif, &quot;Microsoft Yahei UI&quot;; font-size: 14px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary><strong>Companies</strong></summary></details>
>
>给你一个有序数组 `nums` ，请你**[ 原地](http://baike.baidu.com/item/原地算法)** 删除重复出现的元素，使每个元素 **最多出现两次** ，返回删除后数组的新长度。
>
>不要使用额外的数组空间，你必须在 **[原地 ](https://baike.baidu.com/item/原地算法)修改输入数组** 并在使用 O(1) 额外空间的条件下完成。
>
> 
>
>**说明：**
>
>为什么返回数值是整数，但输出的答案是数组呢？
>
>请注意，输入数组是以**「引用」**方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
>
>你可以想象内部操作如下:
>
>```
>// nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
>int len = removeDuplicates(nums);
>
>// 在函数里修改输入数组对于调用者是可见的。
>// 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
>for (int i = 0; i < len; i++) {
>    print(nums[i]);
>}
>```
>
> 
>
>**示例 1：**
>
>```
>输入：nums = [1,1,1,2,2,3]
>输出：5, nums = [1,1,2,2,3]
>解释：函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3 。 不需要考虑数组中超出新长度后面的元素。
>```
>
>**示例 2：**
>
>```
>输入：nums = [0,0,1,1,1,1,2,3,3]
>输出：7, nums = [0,0,1,1,2,3,3]
>解释：函数应返回新长度 length = 7, 并且原数组的前五个元素被修改为 0, 0, 1, 1, 2, 3, 3 。 不需要考虑数组中超出新长度后面的元素。
>```
>
> 
>
>**提示：**
>
>- `1 <= nums.length <= 3 * 104`
>- `-104 <= nums[i] <= 104`
>- `nums` 已按升序排列
>
>------
>
>[Discussion](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/comments/) | [Solution](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/solution/)
>
>```java
>/*
> * @lc app=leetcode.cn id=80 lang=java
> *
> * [80] 删除有序数组中的重复项 II
> */
>
>// @lc code=start
>class Solution {
>    public int removeDuplicates(int[] nums) {
>        int i = 0;
>        int j = 0;
>        while (j < nums.length) {
>            // if (i == 0 || i == 1 || (nums[i - 2] == nums[i - 1] && nums[j] != nums[i -
>            // 1]) || nums[i - 1] != nums[j]) {
>            // 这里想得过于复杂，只要nums[i-2]和nums[j]不一样，那么nums[i-1]和nums[j]也一定不一样
>            // 所以只需要比较nums[i-2]和nums[j]
>            if (i == 0 || i == 1 || nums[i - 2] != nums[j]) {
>                nums[i++] = nums[j++];
>            } else {
>                j++;
>            }
>        }
>        return i;
>        // int n = nums.length;
>        // if (n < 2) {
>        // return n;
>        // }
>        // int slow = 2;
>        // int fast = 2;
>        // while (fast < n) {
>        // if (nums[slow - 2] != nums[fast]) {
>        // nums[slow] = nums[fast];
>        // ++slow;
>        // }
>        // ++fast;
>        // }
>        // return slow;
>    }
>
>}
>// @lc code=end
>```

#### 56.合并区间

># [56.合并区间](https://leetcode-cn.com/problems/merge-intervals/description/)
>
>|  Category  |   Difficulty    | Likes | Dislikes |
>| :--------: | :-------------: | :---: | :------: |
>| algorithms | Medium (46.82%) | 1109  |    -     |
>
><details style="color: rgb(212, 212, 212); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe WPC&quot;, &quot;Segoe UI&quot;, system-ui, Ubuntu, &quot;Droid Sans&quot;, sans-serif, &quot;Microsoft Yahei UI&quot;; font-size: 14px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary><strong>Tags</strong></summary></details>
>
><details style="color: rgb(212, 212, 212); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe WPC&quot;, &quot;Segoe UI&quot;, system-ui, Ubuntu, &quot;Droid Sans&quot;, sans-serif, &quot;Microsoft Yahei UI&quot;; font-size: 14px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary><strong>Companies</strong></summary></details>
>
>以数组 `intervals` 表示若干个区间的集合，其中单个区间为 `intervals[i] = [starti, endi]` 。请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。
>
> 
>
>**示例 1：**
>
>```
>输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
>输出：[[1,6],[8,10],[15,18]]
>解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
>```
>
>**示例 2：**
>
>```
>输入：intervals = [[1,4],[4,5]]
>输出：[[1,5]]
>解释：区间 [1,4] 和 [4,5] 可被视为重叠区间。
>```
>
> 
>
>**提示：**
>
>- `1 <= intervals.length <= 104`
>- `intervals[i].length == 2`
>- `0 <= starti <= endi <= 104`
>
>------
>
>[Discussion](https://leetcode-cn.com/problems/merge-intervals/comments/) | [Solution](https://leetcode-cn.com/problems/merge-intervals/solution/
>
>```java
>
>```
>
>参考重叠区间、合并区间、插入区间

#### 11.盛水最多的容器

># [盛最多水的容器](https://leetcode-cn.com/problems/container-with-most-water/description/)
>
>|  Category  |   Difficulty    | Likes | Dislikes |
>| :--------: | :-------------: | :---: | :------: |
>| algorithms | Medium (62.80%) | 2836  |    -     |
>
><details style="color: rgb(212, 212, 212); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe WPC&quot;, &quot;Segoe UI&quot;, system-ui, Ubuntu, &quot;Droid Sans&quot;, sans-serif, &quot;Microsoft Yahei UI&quot;; font-size: 14px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary><strong>Tags</strong></summary></details>
>
><details style="color: rgb(212, 212, 212); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe WPC&quot;, &quot;Segoe UI&quot;, system-ui, Ubuntu, &quot;Droid Sans&quot;, sans-serif, &quot;Microsoft Yahei UI&quot;; font-size: 14px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary><strong>Companies</strong></summary></details>
>
>给你 `n` 个非负整数 `a1，a2，...，a``n`，每个数代表坐标中的一个点 `(i, ai)` 。在坐标内画 `n` 条垂直线，垂直线 `i` 的两个端点分别为 `(i, ai)` 和 `(i, 0)` 。找出其中的两条线，使得它们与 `x` 轴共同构成的容器可以容纳最多的水。
>
>**说明：**你不能倾斜容器。
>
>
>
>**示例 1：**
>
>![img](1Array.assets/question_11.jpg)
>
>```
>输入：[1,8,6,2,5,4,8,3,7]
>输出：49 
>解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
>```
>
>**示例 2：**
>
>```
>输入：height = [1,1]
>输出：1
>```
>
>**示例 3：**
>
>```
>输入：height = [4,3,2,1,4]
>输出：16
>```
>
>**示例 4：**
>
>```
>输入：height = [1,2,1]
>输出：2
>```
>
>
>
>**提示：**
>
>- `n == height.length`
>- `2 <= n <= 105`
>- `0 <= height[i] <= 104`
>
>------
>
>[Discussion](https://leetcode-cn.com/problems/container-with-most-water/comments/) | [Solution](https://leetcode-cn.com/problems/container-with-most-water/solution/)
>
>```java
>class Solution {
>    // 这道题双指针编码的时候写起来简单，但是想到双指针，以及双指针移动规则却比较难
>    public int maxArea(int[] height) {
>        int low = 0;
>        int high = height.length - 1;
>        int area = 0;
>        while (low < high) {
>            int minheight = height[low] >= height[high] ? height[high] : height[low];
>            if (minheight * (high - low) > area)
>                area = minheight * (high - low);
>            if (height[low] < height[high]) {
>                low++;
>            } else {
>                high--;
>            }
>        }
>        return area;
>
>    }
>}
>```

#### 31.下一个排列

> # [下一个排列](https://leetcode-cn.com/problems/next-permutation/description/)
>
> |  Category  |   Difficulty    | Likes | Dislikes |
> | :--------: | :-------------: | :---: | :------: |
> | algorithms | Medium (37.31%) | 1363  |    -     |
>
> <details style="color: rgb(212, 212, 212); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe WPC&quot;, &quot;Segoe UI&quot;, system-ui, Ubuntu, &quot;Droid Sans&quot;, sans-serif, &quot;Microsoft Yahei UI&quot;; font-size: 14px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary><strong>Tags</strong></summary></details>
>
> <details style="color: rgb(212, 212, 212); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe WPC&quot;, &quot;Segoe UI&quot;, system-ui, Ubuntu, &quot;Droid Sans&quot;, sans-serif, &quot;Microsoft Yahei UI&quot;; font-size: 14px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary><strong>Companies</strong></summary></details>
>
> 实现获取 **下一个排列** 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列（即，组合出下一个更大的整数）。
>
> 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
>
> 必须**[ 原地 ](https://baike.baidu.com/item/原地算法)**修改，只允许使用额外常数空间。
>
>  
>
> **示例 1：**
>
> ```
> 输入：nums = [1,2,3]
> 输出：[1,3,2]
> ```
>
> **示例 2：**
>
> ```
> 输入：nums = [3,2,1]
> 输出：[1,2,3]
> ```
>
> **示例 3：**
>
> ```
> 输入：nums = [1,1,5]
> 输出：[1,5,1]
> ```
>
> **示例 4：**
>
> ```
> 输入：nums = [1]
> 输出：[1]
> ```
>
>  
>
> **提示：**
>
> - `1 <= nums.length <= 100`
> - `0 <= nums[i] <= 100`
>
> ------
>
> [Discussion](https://leetcode-cn.com/problems/next-permutation/comments/) | [Solution](https://leetcode-cn.com/problems/next-permutation/solution/)
>
> ```java
> class Solution {
>     public void nextPermutation(int[] nums) {
>         int i = nums.length - 2;
>         while (i >= 0 && nums[i] >= nums[i + 1]) {
>             i--;
>         }
>         if (i >= 0) {
>             int j = nums.length - 1;
>             while (j >= 0 && nums[j] <= nums[i]) {
>                 j--;
>             }
>              //swap(nums[i], nums[j]);
>             swap(nums, i, j);
>         }
>         reverse(nums, i + 1);
>     }
> 
> 
> 
>     public void swap(int[] nums, int a, int b) {
>         int temp = nums[a];
>         nums[a] = nums[b];
>         nums[b] = temp;
>     }
> 
>     public void reverse(int[] nums, int start) {
>         int i = start;
>         int j = nums.length - 1;
>         while (i < j) {
>             //swap(nums[i], nums[j]);
>             swap(nums, i, j);
>             i++;
>             j--;
>         }
>     }
> }
> ```
>
> **注意：java中参数传递：基本类型是值传递，副本传递，引用类型是引用传递**
>
> >  注意到下一个排列总是比当前排列要大，除非该排列已经是最大的排列。我们希望找到一种方法，能够找到一个大于当前序列的新序列，且变大的幅度尽可能小。
> >
> > 具体地：我们需要将一个左边的「较小数」与一个右边的「较大数」交换，以能够让当前排列变大，从而得到下一个排列。
> >
> > 同时我们要让这个「较小数」尽量靠右，而「较大数」尽可能小。当交换完成后，「较大数」右边的数需要按照升序重新排列。这样可以在保证新排列大于原来排列的情况下，使变大的幅度尽可能小。

#### 48.旋转图像

># [旋转图像](https://leetcode-cn.com/problems/rotate-image/description/)
>
>|  Category  |   Difficulty    | Likes | Dislikes |
>| :--------: | :-------------: | :---: | :------: |
>| algorithms | Medium (73.52%) | 1026  |    -     |
>
><details style="color: rgb(212, 212, 212); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe WPC&quot;, &quot;Segoe UI&quot;, system-ui, Ubuntu, &quot;Droid Sans&quot;, sans-serif, &quot;Microsoft Yahei UI&quot;; font-size: 14px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary><strong>Tags</strong></summary></details>
>
><details style="color: rgb(212, 212, 212); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe WPC&quot;, &quot;Segoe UI&quot;, system-ui, Ubuntu, &quot;Droid Sans&quot;, sans-serif, &quot;Microsoft Yahei UI&quot;; font-size: 14px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary><strong>Companies</strong></summary></details>
>
>给定一个 *n* × *n* 的二维矩阵 `matrix` 表示一个图像。请你将图像顺时针旋转 90 度。
>
>你必须在**[ 原地](https://baike.baidu.com/item/原地算法)** 旋转图像，这意味着你需要直接修改输入的二维矩阵。**请不要** 使用另一个矩阵来旋转图像。
>
> 
>
>**示例 1：**
>
>![img](1Array.assets/mat1.jpg)
>
>```
>输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
>输出：[[7,4,1],[8,5,2],[9,6,3]]
>```
>
>**示例 2：**
>
>![img](1Array.assets/mat2.jpg)
>
>```
>输入：matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
>输出：[[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
>```
>
>**示例 3：**
>
>```
>输入：matrix = [[1]]
>输出：[[1]]
>```
>
>**示例 4：**
>
>```
>输入：matrix = [[1,2],[3,4]]
>输出：[[3,1],[4,2]]
>```
>
> 
>
>**提示：**
>
>- `matrix.length == n`
>- `matrix[i].length == n`
>- `1 <= n <= 20`
>- `-1000 <= matrix[i][j] <= 1000`
>
>------
>
>[Discussion](https://leetcode-cn.com/problems/rotate-image/comments/) | [Solution](https://leetcode-cn.com/problems/rotate-image/solution/)
>
>```java
>/*
> * @lc app=leetcode.cn id=48 lang=java
> *
> * [48] 旋转图像
> */
>
>// @lc code=start
>class Solution {
>
>    public void rotate(int[][] matrix) {
>        // 方法1：规律发现第i行的第j个位置，旋转以后
>        // 会到倒数第i列的第j个位置
>        // 借助辅助数组进行操作
>        // 空间为n^2，时间为n^2
>        int row = matrix.length;
>        int col = matrix[0].length;
>        // int[][] tempMatrix = new int[matrix.length][matrix[0].length];
>        // for (int i = 0; i < row; i++) {
>        // for (int j = 0; j < col; j++) {
>        // tempMatrix[j][col - i - 1] = matrix[i][j];
>        // }
>        // }
>        // for (int i = 0; i < row; i++) {
>        // for (int j = 0; j < col; j++) {
>        // matrix[i][j] = tempMatrix[i][j];
>        // }
>        // }
>
>        // 方法二，首先水平翻转、而后沿对角线翻转，
>        // 对二维矩阵的处理中，方法是带入row、col等未知数
>        // 而后进对未知数进行计算。
>        // 熟悉各种矩阵操作中的角标变化
>
>        // 水平翻转 !!!!!只需要翻转1/2
>        int temp = 0;
>        for (int i = 0; i < row / 2; i++) {
>            for (int j = 0; j < col; j++) {
>                temp = matrix[i][j];
>                matrix[i][j] = matrix[row - i - 1][j];
>                matrix[row - i - 1][j] = temp;
>            }
>        }
>        // 对角线翻转
>
>        for (int i = 0; i < row; i++) {
>            for (int j = i; j < col; j++) {
>                temp = matrix[i][j];
>                matrix[i][j] = matrix[j][i];
>                matrix[j][i] = temp;
>            }
>        }
>
>    }
>}
>// @lc code=end
>
>```

75.颜色分类(荷兰国旗)

> # [颜色分类](https://leetcode-cn.com/problems/sort-colors/description/)
>
> |  Category  |   Difficulty    | Likes | Dislikes |
> | :--------: | :-------------: | :---: | :------: |
> | algorithms | Medium (59.59%) | 1038  |    -     |
>
> <details open="" style="color: rgb(212, 212, 212); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe WPC&quot;, &quot;Segoe UI&quot;, system-ui, Ubuntu, &quot;Droid Sans&quot;, sans-serif, &quot;Microsoft Yahei UI&quot;; font-size: 14px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary><strong>Tags</strong></summary><p style="margin-top: 0px; margin-bottom: 0.7em;"><a href="https://leetcode.com/tag/array" title="https://leetcode.com/tag/array" style="color: var(--vscode-textLink-foreground); text-decoration: none;"><code style="color: var(--vscode-textLink-foreground); font-family: var(--vscode-editor-font-family, &quot;SF Mono&quot;, Monaco, Menlo, Consolas, &quot;Ubuntu Mono&quot;, &quot;Liberation Mono&quot;, &quot;DejaVu Sans Mono&quot;, &quot;Courier New&quot;, monospace); font-size: 1em; line-height: 1.357em; white-space: pre-wrap;">array</code></a><span>&nbsp;</span>|<span>&nbsp;</span><a href="https://leetcode.com/tag/two-pointers" title="https://leetcode.com/tag/two-pointers" style="color: var(--vscode-textLink-foreground); text-decoration: none;"><code style="color: var(--vscode-textLink-foreground); font-family: var(--vscode-editor-font-family, &quot;SF Mono&quot;, Monaco, Menlo, Consolas, &quot;Ubuntu Mono&quot;, &quot;Liberation Mono&quot;, &quot;DejaVu Sans Mono&quot;, &quot;Courier New&quot;, monospace); font-size: 1em; line-height: 1.357em; white-space: pre-wrap;">two-pointers</code></a><span>&nbsp;</span>|<span>&nbsp;</span><a href="https://leetcode.com/tag/sort" title="https://leetcode.com/tag/sort" style="color: var(--vscode-textLink-foreground); text-decoration: none;"><code style="color: var(--vscode-textLink-foreground); font-family: var(--vscode-editor-font-family, &quot;SF Mono&quot;, Monaco, Menlo, Consolas, &quot;Ubuntu Mono&quot;, &quot;Liberation Mono&quot;, &quot;DejaVu Sans Mono&quot;, &quot;Courier New&quot;, monospace); font-size: 1em; line-height: 1.357em; white-space: pre-wrap;">sort</code></a></p></details>
>
> <details style="color: rgb(212, 212, 212); font-family: -apple-system, BlinkMacSystemFont, &quot;Segoe WPC&quot;, &quot;Segoe UI&quot;, system-ui, Ubuntu, &quot;Droid Sans&quot;, sans-serif, &quot;Microsoft Yahei UI&quot;; font-size: 14px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial;"><summary><strong>Companies</strong></summary></details>
>
> 给定一个包含红色、白色和蓝色，一共 `n` 个元素的数组，**[原地](https://baike.baidu.com/item/原地算法)**对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
>
> 此题中，我们使用整数 `0`、 `1` 和 `2` 分别表示红色、白色和蓝色。
>
> 
>
>  
>
> **示例 1：**
>
> ```
> 输入：nums = [2,0,2,1,1,0]
> 输出：[0,0,1,1,2,2]
> ```
>
> **示例 2：**
>
> ```
> 输入：nums = [2,0,1]
> 输出：[0,1,2]
> ```
>
> **示例 3：**
>
> ```
> 输入：nums = [0]
> 输出：[0]
> ```
>
> **示例 4：**
>
> ```
> 输入：nums = [1]
> 输出：[1]
> ```
>
>  
>
> **提示：**
>
> - `n == nums.length`
> - `1 <= n <= 300`
> - `nums[i]` 为 `0`、`1` 或 `2`
>
>  
>
> **进阶：**
>
> - 你可以不使用代码库中的排序函数来解决这道题吗？
> - 你能想出一个仅使用常数空间的一趟扫描算法吗？
>
> ------
>
> [Discussion](https://leetcode-cn.com/problems/sort-colors/comments/) | [Solution](https://leetcode-cn.com/problems/sort-colors/solution/)
>
> ```java
> /*
>  * @lc app=leetcode.cn id=75 lang=java
>  *
>  * [75] 颜色分类
>  */
> 
> // @lc code=start
> class Solution {
>     public void sortColors(int[] nums) {
>         // 这是数据结构考研题目荷兰国旗改编
>         int temp = 0;
>         int i = 0, j = 0, k = nums.length - 1;
>         for (j = i; j <= k;) {
>             if (nums[j] == 0) {
>                 temp = nums[j];
>                 nums[j] = nums[i];
>                 nums[i] = temp;
>                 i++;
>                 j++;
>             } else if (nums[j] == 2) {
>                 temp = nums[j];
>                 nums[j] = nums[k];
>                 nums[k] = temp;
>                 k--;
>             } else {
>                 j++;
>             }
>         }
>     }
> }
> // @lc code=end
> 
> ```

## TODO 

57.插入区间/56合并区间

42.接雨水

