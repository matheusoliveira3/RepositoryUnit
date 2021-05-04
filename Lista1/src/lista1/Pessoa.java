
package lista1;

/**
 *
 * @author mathe
 */
public class Pessoa {
    
    private String CPF;
    private String Nome;
    private String Sexo;
    private int Idade;

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public int getIdade() {
        return Idade;
    }
           
   public String Imprimir(){
       return "Nome: " + Nome + "\n CPF: " + CPF + "\n Sexo: " + Sexo + "\n Idade: " + Idade;
       
            
  };
}

