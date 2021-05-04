
package main;

public class Main {
public static void main(String[] args) {
       

        //Inserir objeto
        
        Pokemon meuPokemon = new Pokemon("Snorlax", "Normal", 50);
        Pokemon outroPokemon = new Pokemon("Charizard", "Fogo", 30);
        Batalha batalha = new Batalha();
        
        meuPokemon.pokemonImpressao();
        outroPokemon.pokemonImpressao();
        
        batalha.meuPokemon (meuPokemon.getNome(), meuPokemon.getHP());
        batalha.outroPokemon (outroPokemon.getNome(), outroPokemon.getHP());
        
        batalha.start();
    }
    
}
