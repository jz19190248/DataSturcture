#include <iostream>
using namespace std;
#define ElemType int
//时间复杂度：
void swap(ElemType *a, ElemType *b)
{
    ElemType *temp = a;
    a = b;
    b = temp;
}
void SelectSort(ElemType A[], int n)
{
    for (int i = 0; i < n; i++)
    {
        int min = i;
        for (int j = i + 1; j < n; j++)
        {
            if (A[j] < A[min])
                min = j;
        }
        if (min != i)
            swap(A[i], A[min]);
    }
}

int main(int argv, char **argc)
{
    ElemType a[] = {13, 15, 65, 323, 5, 43, 21, 47};
    SelectSort(a, 8);
    for (int i = 0; i < 8; i++)
    {
        cout << a[i] << " ";
    }
    return 0;
}