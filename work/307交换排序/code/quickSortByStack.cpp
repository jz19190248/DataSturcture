#include <iostream>
#include <stack>
#include <vector>
using namespace std;

#define ElemType int

int Parttion(ElemType A[], int low, int high)
{
    ElemType point;
    while (low < high)
    {
        point = A[low];
        while (low < high && A[high] > point)
            high--;
        A[low] = A[high];
        while (low < high && A[low] < point)
            low++;
        A[high] = A[low];
    }
    A[low + 1] = point;
    return low;
}

void quickSortByStack(ElemType A[], int low, int high)
{
    if (low < high)
    {
        stack<int> mystack;
        mystack.push(low);
        mystack.push(high);
        while (!mystack.empty())
        {
            int r = mystack.top();
            mystack.pop();
            int l = mystack.top();
            mystack.pop();
            if (l < r)
            {
                int point = Parttion(A, l, r);
                mystack.push(l);
                mystack.push(point - 1);
                mystack.push(point + 1);
                mystack.push(r);
            }
        }
    }
}

int main()
{
    int arr[] = {13, 65, 97, 76, 38, 27, 49};
    quickSortByStack(arr, 0, 6);
    for (int i = 0; i < 7; i++)
    {
        cout << arr[i] << "  " << endl;
    }
    return 0;
}