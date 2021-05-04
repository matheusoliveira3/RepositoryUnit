#include <stdio.h>
#include <stdlib.h>




int main()
{
    int x = 6;
    int y = 3;

    int* p1 = &x;
    int* p2 = &y;

    int* p3 = p1;

    *p3 = *p2 + 10;

    int c = x*y;

    printf("%d\n", c);
}

