#include <stdio.h>

struct Cliente{
char nome [50];
char email[60];
char cidade[70];
int telefone;
};

struct Cliente* novoCliente(char nome[], char email[], char cidade[], int telefone){
    struct Cliente* novo = malloc(sizeof(struct Cliente));

strcpy(novo->nome, nome);
strcpy(novo->email, email);
strcpy(novo->cidade, cidade);
novo-> telefone = telefone;

return novo;
};

void printCliente(struct Cliente* cliente){
printf("Nome: %s\n", cliente -> nome);
printf("Email: %s\n", cliente -> email);
printf("Cidade: %s\n", cliente -> cidade);
printf("Telefone: %d\n", cliente -> telefone);
}
int main()
{

struct Cliente* cliente = novoCliente("Roberto Bollanos", "rob.bollan@gmail.com", "acapulco", 32272222);
printCliente(cliente);
return 0;
}

