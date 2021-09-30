#include <iostream>
using namespace std;
#define ElemType int
void selectOdevity(ElemType A[], int n)
{
    int low = 0;
    int high = n - 1;
    ElemType temp = A[low];
    while (low < high)
    {
        while (low < high && (A[high] % 2 == 0))
            high--;
        A[low] = A[high];
        while (low < high && (A[low] % 2 == 1))
            low++;
        A[high] = A[low];
    }
    A[low] = temp;
}
int main(int argv, char **args)
{
    int arr[] = {65, 97, 76, 38, 27, 49, 34};
    selectOdevity(arr, 7);
    cout << "After select odevity:" << endl;
    for (int i = 0; i < 7; i++)
    {
        cout << arr[i] << "  " << endl;
    }
    return 0;
}