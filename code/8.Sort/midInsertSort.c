void midInsertSort(ElemType A[], int n)
{
    int i, j, mid, high, low;
    for (i = 2; i < n; i++)
    {
        A[0] = A[i];
        low = 1, high = n - 1;
        while (low <= high)
        {
            mid = (low + high) / 2;
            if (A[0] < A[mid])
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        for (j = i - 1; j >= high + 1; --j)
        {
            A[j + 1] = A[j];
        }
        A[high] = A[0];
    }
}