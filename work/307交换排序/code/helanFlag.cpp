#include <iostream>
using namespace std;
typedef enum
{
    RED,
    WHITE,
    BLUE
} color;

void Flag_Arrange(color a[], int n)
{
    int i = 0, j = 0, k = n - 1;
    while (j <= k)
    {
        switch (a[j])
        {
        case RED:
            swap(a[i], a[j]);
            i++, j++;
            break;
        case WHITE:
            j++;
            break;
        case BLUE:
            swap(a[j], a[k]);
            k--;
            //这里没有j++语句，防止交换后依然为蓝色的情况
            break;
        }
    }
}
void swap(color *a, color *b)
{
    color *temp = a;
    a = b;
    b = temp;
    return;
}

int main(int argv, char **args)
{
    color a[] = {RED, BLUE, WHITE, RED, RED, BLUE};
    Flag_Arrange(a, 6);
    for (int i = 0; i < 6; i++)
    {
        cout << a[i] << " ";
    }
    return 0;
}