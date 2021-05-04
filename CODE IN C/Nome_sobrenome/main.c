#include <stdio.h>
#include <stdlib.h>

int main()
{
    char nome[1];
    char sobrenome[150];
    printf("Digite seu nome\n");
    scanf("%s", &nome);
    printf("Digite seu sobrenome\n");
    scanf("%s", &sobrenome);

    printf("Ola, %s %s", nome, sobrenome);
    return 0;
}
