  // EXERCICIO 1 DA AC1

#include <stdio.h>
#include <stdlib.h>

//Um recipiente com �gua foi colocado em um ambiente com temperatura monitorada. Fa�a um
//programa que l� a temperatura do ambiente e informa se �gua o recipiente cont�m �gua em estado
//l�quido, gelo, ou vapor.

int main()
{
int recipiente;
int ambiente;


printf("Por favor, poderia me dizer qual a temperatura em graus do ambiente?" );
scanf("%d", &ambiente);

    if (ambiente >= 0 && ambiente < 100){
        printf("a agua esta liquida");
}
    if (ambiente < 0) {
        printf("a agua esta solida");
}
    if (ambiente >= 100){
        printf(" a agua esta gasosa");
}

}


