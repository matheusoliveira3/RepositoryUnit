// EXERCICIO 7 DA LISTA AC1


//Escreva uma fun��o que recebe tr�s n�meros retorna o menor.

#include <stdio.h>
#include <stdlib.h>
int recebe(void)
{
    int a, b, c;

    printf("digite o primeiro numero: ");
    scanf("%d",&a);
    printf("digite o segundo numero: ");
    scanf("%d",&b);
    printf("digite o terceiro numero: ");
    scanf("%d",&c);

    if(a < b && a < c)
        printf("%d", a);
    else
    if(b < a && b < c)
        printf("%d", b);
    else
        printf("%d", c);
}

int main()
{
    recebe();
}
