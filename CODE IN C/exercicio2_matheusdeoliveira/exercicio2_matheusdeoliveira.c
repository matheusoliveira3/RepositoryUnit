#include <string.h>
    struct Produto {
    char nome[30];      /* Nome do produto */
    char cor[15];       /* Cor do produto */
    char marca[30];     /* Marca do produto */
    char nomeforn[45];  /* Nome do fornecedor */
    char emailforn[50]; /* Email do fornecedor */
    double preco;       /* Preco do produto */
};

    void printProduto(struct Produto* produto){
    printf("Nome do produto: %s\n", produto -> nome);
    printf("Cor: %s\n", produto -> cor);
    printf("Marca: %s\n", produto -> marca);
    printf("Nome do Fornecedor: %d\n", produto -> nomeforn);
    printf("Email do Fornecedor: %d\n", produto -> emailforn);
    printf("Preco: %d\n", produto -> preco);
    };



int main()
{

     struct Produto produto[10];
    strcpy(produto[0].nome,"Camiseta Pink Floyd");
    strcpy(produto[1].cor,"Preta");
    strcpy(produto[2].marca,"Pink Floyd LTDA");
    strcpy(produto[3].nomeforn,"Renner");
    strcpy(produto[4].emailforn,"contato@renner.com.br");
    produto[5].preco = 80;

        printf("\n Nome do produto: %s",                produto[0].nome);
        printf("\n Cor: %s",                            produto[1].cor);
        printf("\n Marca: %s",                          produto[2].marca);
        printf("\n Nome do Fornecedor: %s",             produto[2].nomeforn);
        printf("\n Email do Fornecedor: %s",            produto[2].emailforn);
        printf("\n Preco : R$ %.2f",                     produto[5].preco);


}
