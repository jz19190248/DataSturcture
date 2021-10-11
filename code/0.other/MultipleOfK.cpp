#include <iostream>
#include <algorithm>
using namespace std;
#define debug(a) cout << #a << ":" << a << endl;
int MultipleOfK(int nums[], int n, int k)
{
    int count = 0;
    for (int i = 0; i < n; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (nums[j] - nums[i] >= 0 && (nums[j] - nums[i]) % k == 0)
            {
                cout << "(" << i + 1 << " " << nums[i] << ", " << j + 1 << " " << nums[j] << ")" << endl;
                count++;
            }
        }
    }
    return count;
}
int main(int argv, char **argc)
{
    int nums[] = {123, 223, 123, 523, 200, 2000};
    debug(MultipleOfK(nums, 6, 200)) return 0;
}