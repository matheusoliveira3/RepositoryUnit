
package duelopokemon;


public class PokemonStatus {
    
    private String nome;
    private String elemento;
    private int level;
    private int ataque;
    private int defesa;

    public PokemonStatus(String nome, String elemento, int level) {
        this.nome = nome;
        this.elemento = elemento;
        this.level = level;
        bonusElemento();
    }
    
    public void pokemonscreen (){
        System.out.println(" O nome do seu Pokémon é: " + nome
        + "\n O seu elemento é:  " + elemento
        + "\n O seu level é: " + level
        + "\n O seu ataque é: " + ataque
        + "\n A sua defesa é: " + defesa);
    }
    
    private void bonusElemento (){
    switch (elemento){
        case "Raio": 
        ataque = 200;
        defesa = 100;
        break;
        
        case "Inseto": 
        ataque = 100;
        defesa = 200;
        break;
        
        case "Fogo": 
        ataque = 200;
        defesa = 100;
        break;
        
        case "Gelo": 
        ataque = 100;
        defesa = 200;
        break;
    
}
    } 
   
}
