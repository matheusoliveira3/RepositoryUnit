
package cadastro_clientes;

public class pessoas {
    
    // Atributos    
    private int id;
    private String nome;
    private String cpf;
    private String cidade;
    private String endereco;
    private String estado;

    
    //Construtor da classe é uma regra, que a pessoa tem que passar para chamar a classe pessoas;
    public pessoas(String nome, String cpf, String cidade, String endereco, String estado) {
        this.nome = nome;
        this.cpf = cpf;
        this.cidade = cidade;
        this.endereco = endereco;
        this.estado = estado;
    }


    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    
}
