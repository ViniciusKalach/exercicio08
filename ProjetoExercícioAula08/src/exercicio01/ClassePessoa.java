package exercicio01;

/**
 *
 * @author Vinícius 211559
 */
public class ClassePessoa {
    private String nome;
    private String cpf;
    
    public ClassePessoa(){
    }
    
    public ClassePessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
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
}
