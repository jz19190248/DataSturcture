#include <stdio.h>
#include <malloc.h>
#define ElemType int

//ElemType *B = (ElemType*)malloc(n+1)

void Merge(ElemType A[], int low, int mid, int high)
{
    int n = high - low;
    ElemType *B = (ElemType *)malloc((high - low) * sizeof(ElemType));
    for (int k = low; k < high; k++)
    {
        B[k] = A[k];
    }
    int s = low, i = low, j = mid;
    while (i < mid && j < high)
    {
        if (B[i] <= B[j])
        {
            A[s++] = B[i++];
        }
        else
        {
            A[s++] = B[j++];
        }
        while (i < mid)
        {
            A[s++] = B[i++];
        }
        while (j < high)
        {
            A[s++] = B[j++];
        }
    }
}

void MergeSort(ElemType A[], int low, int high)
{
    if (low < high)
    {
        int mid = (low + high) / 2;
        MergeSort(A, low, mid);
        MergeSort(A, mid, high);
        Merge(A, low, mid, high);
    }
}

int main(int argv, char **argc)
{
    ElemType arr[] = {12, 3, 232, 43, 22, 34, 56, 45, 7, 65, 33};
    MergeSort(arr, 0, 10);
    for (int m = 0; m < 11; m++)
    {
        printf("  __%d ", arr[m]);
    }
    return 0;
}