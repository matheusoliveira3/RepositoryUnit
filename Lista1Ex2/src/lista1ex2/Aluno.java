/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1ex2;

import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 */
public class Aluno {
    private String Ra;
    private String Nome;
    private float AC1;
    private float AC2;
    private float AG;
    private float AF;

    public String getRa() {
        return Ra;
    }

    public void setRa(String Ra) {
        this.Ra = Ra;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public float getAC1() {
        return AC1;
    }

    public void setAC1(float AC1) {
        this.AC1 = AC1;
    }

    public float getAC2() {
        return AC2;
    }

    public void setAC2(float AC2) {
        this.AC2 = AC2;
    }

    public float getAG() {
        return AG;
    }

    public void setAG(float AG) {
        this.AG = AG;
    }

    public float getAF() {
        return AF;
    }

    public void setAF(float AF) {
        this.AF = AF;
    }
    
    public float calcularMedia(){
     return (AC1 * 0.15f) + (AC2 * 0.30f) + (AG * 0.10f) + (AF * 0.45f);
    }
    public String verificaAprov(){
        if(calcularMedia() >= 5){
            return ("Sua nota: " + calcularMedia() + "\nAprovado");
        }   return ("Sua nota: " + calcularMedia() + "\nReprovado") ;
    }
    public String Imprimir(){
        return  
             "Nome: "  + Nome + 
             "\nRa: "  + Ra   + 
             "\nAC1: " + AC1  +
             "\nAC2: " + AC2  + 
             "\nAG: "  + AG   + 
             "\nAF: "  + AF   +
             "\nMEDIA: " + verificaAprov();
    }
}
