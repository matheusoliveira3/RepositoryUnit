
package main;

public class Batalha {
    
    public int meuPokemonHP;
    public int outroPokemonHP;
    public String meuPokemonNome;
    public String outroPokemonNome;
    
    
    
    public void meuPokemon (String meuPokemonNome, int HP)
    {
    this.meuPokemonNome = meuPokemonNome;
    this.meuPokemonHP =  HP;
    };
    
    public void outroPokemon (String outroPokemonNome, int HP)
    {
    this.outroPokemonNome = outroPokemonNome;
    this.outroPokemonHP = HP;
    };
    
    
    
    public void start (){
        if (meuPokemonHP > outroPokemonHP){
            System.out.println("\n" + "Você venceu: " + meuPokemonNome);
        } else {
            System.out.println("Você venceu: " + outroPokemonNome);
        }
    }
}
