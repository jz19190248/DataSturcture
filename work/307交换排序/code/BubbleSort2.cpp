//双向起泡排序
#include <iostream>
#define ElemType int
using namespace std;
void swap(ElemType &a, ElemType &b)
{
    ElemType temp = a;
    a = b;
    b = temp;
}
void BubbleSort(ElemType A[], int n)
{
    int low = 0, high = n - 1;
    bool flag = true;
    while (low < high && flag)
    {
        flag = false;
        for (int i = low; i < high; i++)
        {
            if (A[i] > A[i + 1])
            {
                swap(A[i], A[i + 1]);
                flag = true;
            }
        }
        high--;
        for (int i = high; i > low; i--)
        {
            if (A[i] < A[i - 1])
            {
                flag = false;
                swap(A[i], A[i - 1]);
            }
        }
        low++;
    }
}

int main()
{
    int arr[] = {65, 97, 76, 38, 27, 49, 34};
    BubbleSort(arr, 7);
    cout << "BubbleSort:" << endl;
    for (int i = 0; i < 7; i++)
    {
        cout << arr[i] << "  " << endl;
    }
    return 0;
}