#include <stdio.h>
#include <stdlib.h>

int main()
{
   int a[10];

   for(int i=0; i<10; i++) {
    printf("Digite um numero: ");
    scanf("%d", &a[i]);
   }

   for(int i=9; i>=0; i--)
    printf("%d\n", a[i]);
}
