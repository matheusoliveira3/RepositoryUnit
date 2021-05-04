/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2ex1;

/**
 *
 * @author mathe
 */
public class Apolice {
    private int Numero;
    private String Nome;
    private int Idade;
    private char Sexo;
    private double valorAutomovel;

    
    public Apolice(){}
    
    public Apolice(int Numero, String Nome, int Idade, char Sexo, double valorAutomovel) {
        this.Numero = Numero;
        this.Nome = Nome;
        this.Idade = Idade;
        this.Sexo = Sexo;
        this.valorAutomovel = valorAutomovel;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public double getValorAutomovel() {
        return valorAutomovel;
    }

    public void setValorAutomovel(double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }
            
            
            
            
    public double calcularValor(){   
      if (getSexo() == 'M' && getIdade() <= 25)
        return getValorAutomovel() * 10/100;
      else if (getSexo() == 'M' && getIdade () > 25)
          return getValorAutomovel() *5/100;
      else 
          return getValorAutomovel()* 2/100;
                }
    
    public String imprimir(){
        return    "Número: "        + Numero +          "\n"
                + "Nome: "          + Nome +            "\n"
                + "Idade: "         + Idade +           "\n"
                + "Sexo: "          + Sexo +            "\n"
                + "Valor Auto: "    + valorAutomovel +  "\n"
                + "Valor Apolice: " + calcularValor();
    }
}
