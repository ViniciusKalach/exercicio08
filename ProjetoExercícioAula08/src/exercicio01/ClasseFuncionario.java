package exercicio01;

/**
 *
 * @author Vinícius 211559
 */
public class ClasseFuncionario extends ClassePessoa{
    private int numeroCracha;
    private double salario;

    public ClasseFuncionario() {
    }
    
    public ClasseFuncionario(String nome, String cpf, int numeroCracha, double salario){
        this.numeroCracha = numeroCracha;
        this.salario = salario;
        setNome(nome);
        setCpf(cpf);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumeroCracha() {
        return numeroCracha;
    }

    public void setNumeroCracha(int numeroCracha) {
        this.numeroCracha = numeroCracha;
    }
    
    @Override
    public String toString(){
        return "Nome: "+ getNome() +
                "\nCPF: "+ getCpf() +
                "\nCracha: "+ numeroCracha +
                "\nSalário: "+ salario;
    }
}
