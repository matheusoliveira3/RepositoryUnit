#include <stdio.h>

struct Player{
char nome [50];
char classe[60];
char guilda[70];
int  nivel;
};

struct Player* novoPlayer(char nome[], char classe[], char guilda[], int nivel){
    struct Player* novo = malloc(sizeof(struct Player));

strcpy(novo->nome, nome);
strcpy(novo->classe, classe);
strcpy(novo->guilda, guilda);
novo-> nivel = nivel;

return novo;
};

void printPlayer(struct Player* player){
printf("Nome: %s\n", player -> nome);
printf("Classe: %s\n", player -> classe);
printf("Guilda: %s\n", player -> guilda);
printf("Nivel: %d\n", player -> nivel);
}
int main()
{

struct Player* player = novoPlayer("Arthas Mennethill", "Lich King", "Legion Interpridos", 80);
printPlayer(player);
return 0;
}


