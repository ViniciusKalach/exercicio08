package exercicio01;

import java.util.Scanner;

/**
 *
 * @author Vinícius 211559
 */
public class MenuMain {

    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        Scanner read = new Scanner(System.in);
        Disciplina d = new Disciplina();
        ClasseProfessor prof = new ClasseProfessor();
        ClasseAtendente ate = new ClasseAtendente();
        ClasseAluno alu = new ClasseAluno();
        
        while (i != 7) {
            System.out.println("MENU");
            System.out.println("1 - Inserir Disciplina");
            System.out.println("2 - Inserir Professor");
            System.out.println("3 - Inserir Atendente");
            System.out.println("4 - Inserir Aluno");
            System.out.println("5 - Adicionar Disciplina ao Professor");
            System.out.println("6 - Mostrar Pessoas");
            System.out.println("7 - Sair");
            
            System.out.print("Escolha uma opção: ");
            i = Integer.parseInt(read.nextLine());
            
            switch (i) {
                case 1:
                    System.out.println("Você escolheu a opção 1.");
                    System.out.println("Insira o nome da disciplina.");
                    d.setNome(read.nextLine());
                    System.out.println("Insira o código da disciplina.");
                    d.setCodigo(Integer.parseInt(read.nextLine()));
                    System.out.println("Disciplina " + d.getNome() + " criada com sucesso");
                    break;
                case 2:
                    System.out.println("Você escolheu a opção 2.");
                    System.out.println("Insira o nome do professor.");
                    prof.setNome(read.nextLine());
                    System.out.println("Insira o CPF do professor.");
                    prof.setCpf(read.nextLine());
                    System.out.println("Insira o número do crachá do professor.");
                    prof.setNumeroCracha(Integer.parseInt(read.nextLine()));
                    System.out.println("Insira o salário do professor.");
                    prof.setSalario(read.nextDouble());
                    read.nextLine();
                    System.out.println("Insira o currículo do professor.");
                    prof.setUrlCurriculoLattes(read.nextLine());
                    System.out.println("Professor " + prof.getNome() + " registrado com sucesso");
                    break;
                case 3:
                    System.out.println("Você escolheu a opção 3.");
                    System.out.println("Insira o nome do atendente.");
                    ate.setNome(read.nextLine());
                    System.out.println("Insira o CPF do atendente.");
                    ate.setCpf(read.nextLine());
                    System.out.println("Insira o número do crachá do atendente.");
                    ate.setNumeroCracha(Integer.parseInt(read.nextLine()));
                    System.out.println("Insira o salário do atendente.");
                    ate.setSalario(read.nextDouble());
                    read.nextLine();
                    System.out.println("Insira o setor do atendente.");
                    ate.setSetor(read.nextLine());
                    System.out.println("Insira a funçao do atendente.");
                    ate.setFuncao(read.nextLine());
                    System.out.println("Atendente " + ate.getNome() + " registrado com sucesso");
                    break;
                case 4:
                    System.out.println("Você escolheu a opção 4.");
                    System.out.println("Insira o nome do aluno.");
                    alu.setNome(read.nextLine());
                    System.out.println("Insira o CPF do aluno.");
                    alu.setCpf(read.nextLine());
                    System.out.println("Insira o RA do aluno.");
                    alu.setRa(read.nextLine());
                    System.out.println("Insira o curso do aluno.");
                    alu.setCurso(read.nextLine());
                    System.out.println("Aluno " + alu.getNome() + " registrado com sucesso");
                    break;
                case 5:
                    System.out.println("Você escolheu a opção 5.");
                    // System.out.println("Insira a disciplina que queira anexar ao professor.");
                    // prof.addDisciplina(d.getNome());
                    System.out.println("Não consegui fazer essa parte.");
                    break;
                case 6:
                    System.out.println("Você escolheu a opção 6");
                    System.out.println("Qual pessoa você deseja visualizar?");
                    System.out.println("1 - professor.");
                    System.out.println("2 - aluno.");
                    System.out.println("3 - atendente.");
                    int i2 = 0;
                    i2 = Integer.parseInt(read.nextLine());
                    if (i2 == 1){
                        System.out.println("Visualizar professor.");
                        prof.toString();
                    } else if (i2 == 2){
                        System.out.println("Visualizar aluno.");
                        alu.toString();
                    } else if (i2 == 3){
                        System.out.println("Visualizar atendente.");
                        ate.toString();
                    } else {
                        System.out.println("Opção inválida.");
                        break;  
                    }
                    break;
                case 7:
                    System.out.println("Saindo.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        read.close();
    }
    
}
