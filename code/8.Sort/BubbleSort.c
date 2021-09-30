void BubbleSort(ElemType A[], int n)
{
    for (int i = 0; i < n; i++)
    {
        flag = false;
        for (int j = n - 1; j > i; j--)
        {
            if (A[j - 1] > A[j])
            {
                swap(A[j - 1], A[j]);
                flag = true;
            }
        }
        if (flag == false)
        {
            return;
        }
    }
}