#include <iostream>
#include <cstdlib>

using namespace std;
#define ElemType int

int Parttion(ElemType A[], int low, int high)
{
    int rand_index = low + rand() % (high - low + 1);
    ElemType temp = A[low];
    A[low] = A[rand_index];
    A[rand_index] = temp;

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

void quickSort(ElemType A[], int low, int high)
{
    if (low < high)
    {
        ElemType point = Parttion(A, low, high);
        quickSort(A, low, point - 1);
        quickSort(A, point + 1, high);
    }
}

int main(int argv, char **args)
{
    int arr[] = {65, 21, 76, 38, 27, 49, 34};
    quickSort(arr, 0, 6);
    cout << "quickSort:" << endl;
    for (int i = 0; i < 7; i++)
    {
        cout << arr[i] << "  " << endl;
    }
    return 0;
}