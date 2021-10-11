#define ElemType int
bool IsMinHeap(ElemType A[], int len)
{
    if (len % 2 == 0)
    {
        //len为偶数，有一个单分支点
        if (A[len / 2] > A[len])
        { //判断单分支结点
            return false;
        }
        for (int i = len / 2 - 1; i >= 1; i--)
        {
            if (A[i] > A[2 * i] || A[i] > A[2 * i + 1])
            {
                return false;
            }
        }
    }
    else
    {
        for (int i = len / 2; i >= 1; i--)
        {
            if (A[i] > A[2 * i] || A[i] > A[2 * i + 1])
            {
                return false;
            }
        }
    }
    return true;
}