
package batalhapokemon;

public class Pokemon {
    
    // 1° Passo: Criar os atributos do objeto pokemon;
    // 2° Passo: Encapsular deixar os atributos privados, no caso, ataque, defesa e level.
   
    //Private não pode ser alterado pelo usuário;
    //Public pode ser alterado;
   
    //Construtor da classe vai dizer como o objeto vai ser criado;
    //Método de impressão de todos atributos para o objeto tipo pokemon;
   
    private String nome;
    private String elemento;
    private int level;
    private int vida;
    private int ataque;
    private int defesa;
    private int hp;
   
    
//Impressão
    public void meuPokemonImprime(){
        System.out.println(
                  "Nome: " + nome  + "\n" 
                + "Elemento: " + elemento + "\n" 
                + "Vida: " +   vida + "\n" 
                + "Ataque: " + ataque + "\n" 
                + "Defesa: " + defesa + "\n" 
                + "Level: " +  level + "\n");
    }
    
    
   //Construtor 
    public Pokemon(String nome, String elemento, int level){ 
        this.nome = nome;
        this.elemento = elemento;
        this.level = level;
        
        calculoAtributos();
        calculoBonus();
    }
    



    //Status dos pokemons de acordo com o elemento
    private void calculoAtributos(){
        switch(elemento){
            case "Fogo":
                vida = vida - 30;
                defesa = 50;
                ataque = 80;
                break;
                
                case "Planta":
                vida = vida - 10;
                defesa = 80;
                ataque = 50;
                break;
        }
    }
    
    
     
    private void calculoBonus(){
        vida = vida + (level / 2);
        ataque = ataque + (level / 3);
        defesa = defesa + (level / 4);
    }
    
    //Get
    public int getVida(){
        return this.vida;
    }
    
     public int getAtaque(){
        return this.ataque;
    }
     
      public int getDefesa(){
        return this.defesa;
    }
      
       public int getHP(){
        return this.hp;
    }
       public String getNome(){
           return this.nome;
       }
       
}


