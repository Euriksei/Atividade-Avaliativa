import java.util.Scanner;

public class Pratica4 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite um nome: ");
        String nome1 = scanner.nextLine();
        System.out.printf("Digite outro nome: ");
        String nome2 = scanner.nextLine();

        System.out.printf("Digite uma idade: ");
        int idade1 = scanner.nextInt();
        System.out.printf("Digite outra idade: ");
        int idade2 = scanner.nextInt();

        System.out.println("Nome 1: " + nome1 + ", idade: " + idade1);
        System.out.println("Nome 2: " + nome2+ ", idade: " + idade2);

        scanner.close();

    }
}
