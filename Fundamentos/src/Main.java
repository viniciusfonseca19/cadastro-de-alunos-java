import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Integer> idades = new ArrayList<>();
        ArrayList<Double> nota1 = new ArrayList<>();
        ArrayList<Double> nota2 = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Editar aluno");
            System.out.println("4 - Adicionar notas");
            System.out.println("5 - Mostrar média");
            System.out.println("6 - Remover aluno");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome: ");
                    nomes.add(sc.nextLine());

                    System.out.print("Idade: ");
                    idades.add(sc.nextInt());
                    sc.nextLine();

                    nota1.add(0.0);
                    nota2.add(0.0);

                    System.out.println("Aluno cadastrado!");
                    break;

                case 2:
                    if (nomes.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        for (int i = 0; i < nomes.size(); i++) {
                            System.out.println(i + " - " + nomes.get(i) +
                                    " | Idade: " + idades.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o número do aluno: ");
                    int edit = sc.nextInt();
                    sc.nextLine();

                    if (edit >= 0 && edit < nomes.size()) {
                        System.out.print("Novo nome: ");
                        nomes.set(edit, sc.nextLine());

                        System.out.print("Nova idade: ");
                        idades.set(edit, sc.nextInt());
                        sc.nextLine();

                        System.out.println("Aluno editado!");
                    } else {
                        System.out.println("Aluno inválido.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o número do aluno: ");
                    int n = sc.nextInt();

                    if (n >= 0 && n < nomes.size()) {
                        System.out.print("Nota 1: ");
                        nota1.set(n, sc.nextDouble());

                        System.out.print("Nota 2: ");
                        nota2.set(n, sc.nextDouble());
                        sc.nextLine();

                        System.out.println("Notas adicionadas!");
                    } else {
                        System.out.println("Aluno inválido.");
                    }
                    break;

                case 5:
                    System.out.print("Digite o número do aluno: ");
                    int m = sc.nextInt();

                    if (m >= 0 && m < nomes.size()) {
                        double media = (nota1.get(m) + nota2.get(m)) / 2;
                        System.out.println("Média: " + media);
                    } else {
                        System.out.println("Aluno inválido.");
                    }
                    break;

                case 6:
                    System.out.print("Digite o número do aluno: ");
                    int r = sc.nextInt();

                    if (r >= 0 && r < nomes.size()) {
                        nomes.remove(r);
                        idades.remove(r);
                        nota1.remove(r);
                        nota2.remove(r);

                        System.out.println("Aluno removido!");
                    } else {
                        System.out.println("Aluno inválido.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
