/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3ex2;

/**
 *
 * @author mathe
 */
public class Automovel {
    private String modelo;
    private String marca;

    
    
    public Automovel (){
    }
    
    public Automovel (String modelo, String marca){
    }
    
    public String imprimir(){
   return "Modelo: " + modelo +
           "Marca: " + marca;
           }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
    
}
