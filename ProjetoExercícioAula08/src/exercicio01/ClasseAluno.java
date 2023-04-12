package exercicio01;

/**
 *
 * @author Vinícius 211559
 */
public class ClasseAluno extends ClassePessoa {
    private String ra;
    private String curso;
    
    public ClasseAluno(){
        
    }
    
    public ClasseAluno(String nome, String cpf, String ra, String curso){
        this.ra = ra;
        this.curso = curso;
        setNome(nome);
        setCpf(cpf);
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    @Override
    public String toString(){
        return "Nome: "+ getNome() +
                "\nCPF: "+ getCpf() +
                "\nRA: "+ ra +
                "\nCurso: "+ curso;
    }
    
}
