#include <iostream>
#define ElemType int
using namespace std;
typedef struct
{
    Node *pointer;
    ElemType value;
} Node;

void SelcetSort(Node *link)
{
    Node *p = link->pointer;
    Node *h = link, *p, *q, *r, *s;
    link = NULL;
    while (h != NULL)
    {
        p = s = h;
        //p为工作指针，s为标记指针，q为p的前驱指针，r为s的前驱指针
        q = r = NULL;
        while (p != NULL)
        {
            if (p->value > s->value)
            {
                s = p;
                r = q;
            }
            q = p;
            p = p->pointer;
        }
        if (s == h)
        {
            h = h->pointer;
        }
        else
            r->pointer = s->pointer;
        s->pointer = link;
        link = s;
    }
}