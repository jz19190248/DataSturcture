#include <iostream>
using namespace std;
#define debug(a) cout << #a << a << endl;

int setPartition(int nums[], int n)
{
    int pivotkey, low = 0, low0 = 0, high = n - 1, high0 = n - 1, flag = 1, k = n / 2, i;
    int s1 = 0, s2 = 0;
    while (flag)
    {
        pivotkey = nums[low];
        while (low < high)
        {
            while (nums[high] > pivotkey)
                high--;
            nums[low] = nums[high];
            while (nums[low] < pivotkey)
                low++;
            nums[high] = nums[low];
        }
        nums[low] = pivotkey;
        if (low = k - 1)
            flag = 0;
        else
        {
            if (low < k - 1)
            {
                low0 = ++low;
                high = high0;
            }
            else
            {
                high0 = --high;
                low = low0;
            }
        }
    }
    for (int j = 0; j < n; j++)
    {
        debug(nums[j])
    }
    for (i = 0; i < k; i++)
        s1 += nums[i];
    for (i = k; i < n; i++)
        s2 += nums[i];
    return s2 - s1;
}
int main(int argv, char **args)
{
    int arr[] = {65, 21, 76, 38, 27, 49, 34};
    debug(setPartition(arr, 7)) return 0;
}