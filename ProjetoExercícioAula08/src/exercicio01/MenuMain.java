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
                    System.out.println("Você escolheu a oção 1.");
                    System.out.println("Insira o nome da disciplina.");
                    d.setNome(read.nextLine());
                    System.out.println("Insira o código da disciplina.");
                    d.setCodigo(read.nextInt());
                    read.nextLine();
                    break;
                case 2:
                    break;
                case 3:
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
