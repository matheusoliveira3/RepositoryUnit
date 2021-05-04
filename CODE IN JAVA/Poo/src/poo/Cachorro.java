
package poo;

public class Cachorro {
 
    //Atributos "caracteristicas"
  public String nome;
  public String raca;
  public int peso;
  public String cor;
  
  //Métodos "Ações"
  public void imprimeCachorro(){
      System.out.println("Nome: " + nome);
      System.out.println("Raça: " + raca);
      System.out.println("Cor: " + cor);
      System.out.println("Peso: " + peso + "kg");
  }
  
public void latir(){
        if(peso > 5 && peso < 10){
            System.out.println("Yip, Yip");
        }else if(peso > 10 && peso < 20){
            System.out.println("Au au");
        }else if(peso > 20){
            System.out.println("Woof, woof");
        }        
    }

  
    public int calculaPeso (int pesoAtual){
        int peso = pesoAtual + 50;
        return peso;
    }
    
}
