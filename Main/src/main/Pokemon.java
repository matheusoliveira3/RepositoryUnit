
package main;


    public class Pokemon {
    //Um pokemon possui, nome, elemento, level, ataque, defesa e vida
    //Atributos
    
        private String nome;
        private String elemento;
        private int level;
        private int ataque;
        private int defesa;
        private int vida;
        public int HP;
    
    //Construtor
    public Pokemon(String nome, String elemento, int level){
        this.nome = nome;
        this.elemento = elemento;
        this.level = level;
        
        calculoAtributos();
    
    }
    
    //Imprimir atributos pokemons
    public void pokemonImpressao(){
        System.out.println("\n");
        System.out.println("Olá: " + nome);
        System.out.println("Seu tipo é: " + elemento);
        System.out.println("O seu level é: " + level);
        System.out.println("O seu ataque é: " + ataque);
        System.out.println("A sua defesa é: " + defesa);
        System.out.println("A sua vida base é: " + vida);
    }
    
    //Calculo de atributos
    private void calculoAtributos(){
       switch(elemento){
           case "Normal":
           vida = 500;
           defesa = 250;
           ataque = 800;
           break;
           
           case "Fogo":
           vida = 700;
           defesa = 800;
           ataque = 500;
           break;
    } 
    }
    
    public int getHP (){
        return this.vida;
    }
    
    public String getNome (){
        return this.nome;
    }   
}
