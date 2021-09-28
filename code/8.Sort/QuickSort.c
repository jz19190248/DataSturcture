int Parttion(ElemType A[], int low, int high)
{
    ElemType point = A[low];
    while (low < high)
    {
        while (low < high && A[high] >= A[0])
            high--;
        A[low] = A[high];
        while (low < high && A[low] < A[0])
            low++;
        A[high] = A[low];
    }
    A[low] = point;
    return low;
}

void QuickSort(ElemType A[], int low, int high)
{
    if (low < high)
    {
        int point = Parttion(A, low, high);
        QuickSort(A, low, point - 1);
        QuickSort(A, point + 1, high);
    }
}