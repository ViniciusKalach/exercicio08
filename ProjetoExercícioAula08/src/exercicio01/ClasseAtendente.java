package exercicio01;

/**
 *
 * @author Vinícius 211559
 */
public class ClasseAtendente extends ClasseFuncionario{
    private String setor;
    private String funcao;

    public ClasseAtendente() {
    }

    public ClasseAtendente(String nome, String cpf, String setor, String funcao) {
        this.setor = setor;
        this.funcao = funcao;
        setNome(nome);
        setCpf(cpf);
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    @Override
    public String toString(){
        return  "Nome: "+ getNome() +
                "\nCPF: "+ getCpf() +
                "\nCracha: "+ getNumeroCracha() +
                "\nSalário: "+ getSalario() +
                "\nSetor: "+ getSetor() +
                "\nFunção: "+ getFuncao();
    }
}
