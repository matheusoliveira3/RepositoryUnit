

#include <stdio.h>
#include <stdlib.h>

//EXERCICIO 3
// Escreva uma fun��o que informa se um n�mero � �mpar. Use o operador % (m�dulo). Opcional: retorne 1 para verdadeiro, 0 para falso.



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
