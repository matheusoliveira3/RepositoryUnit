#include <stdio.h>

int fibonacci (int x)
{
    int a, fibonacci1 = 1, fibonacci2 = 1, soma;
    for (a = 3; a <= x; a = a + 1)
    {
        soma = fibonacci1 + fibonacci2;
        fibonacci1 = fibonacci2;
        fibonacci2 = soma;
    }
    return fibonacci2;
}





void main()
{
int x;
printf ("Escolha um numero: ");
scanf("%d", &x);
printf("posicao do fibonacci: %d\n", fibonacci(x));
return 0;
}
