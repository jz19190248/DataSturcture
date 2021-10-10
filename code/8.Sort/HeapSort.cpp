//存在问题，13不存在了？，回看检查
#include <iostream>
using namespace std;
#define ElemType int
void swap(ElemType *a, ElemType *b)
{
    ElemType *temp = a;
    a = b;
    b = temp;
}
void HeapAdjust(ElemType A[], int k, int len)
{
    //对以元素k为根的树进行调整
    A[0] = A[k]; //A[0]暂存子树的根节点
    for (int i = 2 * k; i <= len; i *= 2)
    {
        if (i < len && A[i] < A[i + 1])
            i++; //取出子结点中的较大值
        if (A[0] >= A[i])
            break;
        else
        {
            A[k] = A[i]; //将i放到双亲结点上
            k = i;       //调整子结点，然后对子树进行重调整
        }
        A[k] = A[0];
    }
}

void BuildMaxHeap(ElemType A[], int len)
{
    for (int i = len / 2; i > 0; i--)
    {
        HeapAdjust(A, i, len);
    }
}

void HeapSort(ElemType A[], int n)
{
    BuildMaxHeap(A, n);
    for (int i = n; i > 1; i--)
    {
        swap(A[i], A[1]);        //将堆底元素与堆顶元素进行交换
        HeapAdjust(A, 1, i - 1); //对0-（i-1）的堆继续进行调整
    }
}

int main(int argv, char **argc)
{
    ElemType a[] = {13, 15, 65, 323, 5, 43, 21, 47};
    HeapSort(a, 8);
    for (int i = 1; i <= 8; i++)
    {
        cout << a[i] << " ";
    }
    return 0;
}