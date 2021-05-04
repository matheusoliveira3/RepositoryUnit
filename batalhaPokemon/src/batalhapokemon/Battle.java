
package batalhapokemon;


public class Battle {
    
    private int meuPokemonHP;
    private int outroPokemonHP;
    private String meuPokemonNome;
    private String outroPokemonNome;
    
    public void pokemon (String nome, int hp){
        this.meuPokemonHP = hp;
        this.meuPokemonNome = nome;
    }
    
    public void enemypokemon (String nome, int hp){
        this.outroPokemonHP = hp;
        this.outroPokemonNome = nome;
    }
    
    public void start(){
        if(meuPokemonHP > outroPokemonHP){
            System.out.println("Pokemon Vencedor: " + meuPokemonNome);
        } else{
            System.out.println("Pokemon Vencedor: " + outroPokemonHP);
        }
    }

   
}
