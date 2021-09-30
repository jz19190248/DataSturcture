#include <iostream>
#include <stack>
#include <vector>
#include <queue>
using namespace std;

#define ElemType int

int Parttion(ElemType A[], int low, int high)
{
    ElemType point = A[low];
    while (low < high)
    {
        while (low < high && A[high] > point)
            high--;
        A[low] = A[high];
        while (low < high && A[low] < point)
            low++;
        A[high] = A[low];
    }
    A[low] = point;
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
    else
        return;
}

void quickSortByQueue(ElemType A[], int low, int high)
{
    if (low >= high)
        return;
    queue<int> qu;
    qu.push(low);
    qu.push(high);
    while (!qu.empty())
    {
        int l = qu.front();
        qu.pop();
        int r = qu.front();
        qu.pop();
        if (l < r)
        {
            int point = Parttion(A, l, r);
            qu.push(l);
            qu.push(point - 1);
            qu.push(point + 1);
            qu.push(r);
        }
    }
}

int main()
{
    int arr1[] = {65, 97, 76, 38, 27, 49, 34};
    quickSortByStack(arr1, 0, 6);
    cout << "quickByStack:";
    for (int i = 0; i < 7; i++)
    {
        cout << arr1[i] << "  " << endl;
    }

    int arr2[] = {65, 25, 76, 38, 27, 49, 34};
    quickSortByQueue(arr2, 0, 6);
    cout << "quickByQueue:";
    for (int i = 0; i < 7; i++)
    {
        cout << arr2[i] << "  " << endl;
    }
    return 0;
}
