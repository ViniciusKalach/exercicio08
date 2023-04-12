package exercicio01;

import java.util.ArrayList;

/**
 *
 * @author Vinícius 211559
 */
public class ClasseProfessor extends ClasseFuncionario {
    private String urlCurriculoLattes;
    private ArrayList<Disciplina> disciplinas;

    public ClasseProfessor() {
    }

    public ClasseProfessor(String nome, String cpf, String urlCurriculoLattes) {
        setNome(nome);
        setCpf(cpf);
        this.urlCurriculoLattes = urlCurriculoLattes;
    }

    public String getUrlCurriculoLattes() {
        return urlCurriculoLattes;
    }

    public void setUrlCurriculoLattes(String urlCurriculoLattes) {
        this.urlCurriculoLattes = urlCurriculoLattes;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    public void addDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
    
    public void removeDisciplina(int index){
        disciplinas.remove(index);
    }
    
    public void removeDisciplina(Disciplina disciplina){
        disciplinas.remove(disciplina);
    }
    
    public Disciplina getDisciplina(int index){
        return disciplinas.get(index);
    }
    
    @Override
    public String toString(){
        StringBuilder ds = new StringBuilder();
        for (Disciplina disciplina : disciplinas) {
            ds.append(disciplina.toString());
        }
        
        return  "Nome: "+ getNome() +
                "\nCPF: "+ getCpf() +
                "\nCracha: "+ getNumeroCracha() +
                "\nSalário: "+ getSalario() +
                "\nCurriculo: "+ getUrlCurriculoLattes() +
                "\nDisciplinas: "+ ds;
    }
}
