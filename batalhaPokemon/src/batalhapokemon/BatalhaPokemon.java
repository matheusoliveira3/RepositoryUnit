package batalhapokemon;
public class BatalhaPokemon {

        // 3° Passo: Chamar/Instanciar a classe que ira ser criada.
    
        //Pokemon é a classe, pokemon é o objeto
    
        //Instanciar e definir atributos a um objeto publico;
        
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon("Charizard", "Fogo", 120);
        Pokemon enemypokemon  = new Pokemon("Venusaur", "Planta", 120);
        Battle batalha = new Battle();


        batalha.pokemon(pokemon.getNome(), pokemon.getHP());
        batalha.enemypokemon(enemypokemon.getNome(), enemypokemon.getHP());
        
        
        batalha.start();
        
        
        pokemon.meuPokemonImprime();
        enemypokemon.meuPokemonImprime();
    }
    
}
