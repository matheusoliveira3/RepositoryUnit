/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3ex2;

import java.util.ArrayList;

/**
 *
 * @author mathe
 */
public class Pessoa {
    private int codigo;
    private String nome;
    ArrayList<Automovel> automoveis;
    
    public Pessoa(){
    automoveis = new ArrayList<>();
    }
    
    public Pessoa (int codigo, String nome){
    this();
    this.codigo = codigo;
    this.nome = nome;
    
    }
    
    public String imprimir(){
        return "Código: " + codigo + "\n"
                + "Nome: " + nome +"\n";         
    }
      
    public String imprimirCompleto(){
        String retorno = imprimir() + "\n -- PESSOAS --\n";
        for(Automovel a : automoveis){
            retorno += a.imprimir() + "\n";
        }
        return retorno;
    }
    
    public void inserirAutomovel(Automovel automovel){
        automoveis.add(automovel);
    }
    
    public void removerAutomovel (int index){
        automoveis.remove(index);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Automovel> getAutomovel() {
        return automoveis;
    }

    public void setAutomovel(ArrayList<Automovel> automovel) {
        this.automoveis = automovel;
    }
    
    
}
