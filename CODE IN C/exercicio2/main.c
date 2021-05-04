

#include <stdio.h>
#include <stdlib.h>

//EXERCICIO 3
// Escreva uma função que informa se um número é ímpar. Use o operador % (módulo). Opcional: retorne 1 para verdadeiro, 0 para falso.



void impar (int n)
{
    if (n % 2 != 0){
        printf("seu numero e impar");
    }
    else {printf("e par");}
}

int main()
{
    int n;
    impar(4);
}
