//寻找数组中最小值
#include <iostream>
#include <cstdlib>
#define debug(a) cout << #a << a << endl;
using namespace std;

int Partition(int L[], int low, int high)
{
    int point = L[low];
    while (low < high)
    {
        while (low < high && L[high] > point)
            high--;
        L[low] = L[high];
        while (low < high && L[low] < point)
            low++;
        L[high] = L[low];
    }
    L[low] = point;

    return low;
}
int findKthMinst(int L[], int n, int k)
{
    //采用随机枢轴，防止特殊测试用例，如递增序列或递减序列影响计算性能；
    // int radomIndex = 0 + rand() % (n - 1);
    // int temp = L[0];
    // L[0] = L[radomIndex];
    // L[radomIndex] = temp;

    int low = 0;
    int high = n - 1;
    while (true)
    {
        int point = Partition(L, low, high);
        if (point == k)
        {
            debug(point);
            return L[point - 1];
        }
        else if (point > k)
        {
            high = point - 1;
        }
        else
        {
            low = point + 1;
        }
    }
}

int main(int argv, char **argc)
{

    int arr[] = {65, 97, 76, 38, 27, 49, 34};
    cout << findKthMinst(arr, 7, 2);
    return 0;
}
