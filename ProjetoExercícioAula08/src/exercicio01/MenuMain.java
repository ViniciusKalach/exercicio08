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
            i = read.nextInt();
            
            switch (i) {
                case 1:
                    Disciplina d = new Disciplina();
                    System.out.println("Você escolheu a opção 1.");
                    System.out.println("Insira o nome da disciplina.");
                    d.setNome(read.nextLine());
                    System.out.println("Insira o código da disciplina.");
                    d.setCodigo(Integer.parseInt(read.nextLine()));
                    System.out.println("Disciplina " + d.getNome() + " criada com sucesso");
                    break;
                case 2:
                    ClasseProfessor prof = new ClasseProfessor();
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
                    ClasseAtendente ate = new ClasseAtendente();
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
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        read.close();
    }
    
}
