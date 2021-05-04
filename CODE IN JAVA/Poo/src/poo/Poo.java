
package poo;

public class Poo {
    public static void main(String[] args) {
   
        int novoPeso;
        //Instanciar um novo objeto
    Cachorro cachorro1 = new Cachorro();

    
        //Nome
    cachorro1.nome = "Théo";
        //Raça
    cachorro1.raca = "Maltês";
        //Cor
    cachorro1.cor = "Branco";
        //Peso
    cachorro1.peso = 5;
    
    cachorro1.latir();

        
        //Imprimindo sem sout.
    cachorro1.imprimeCachorro();

    novoPeso = cachorro1.calculaPeso(cachorro1.peso);
    
    System.out.println("Novo Peso: " + novoPeso + "kg");
    }
    
}
