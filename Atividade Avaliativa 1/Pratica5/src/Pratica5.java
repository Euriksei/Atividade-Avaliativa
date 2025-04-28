import java.util.Scanner;

public class Pratica5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite um nome: ");
        String nome1 = scanner.nextLine();

        System.out.printf("Digite a idade: ");
        int idade1 = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("Digite um nome: ");
        String nome2 = scanner.nextLine();

        System.out.printf("Digite a idade: ");
        int idade2 = scanner.nextInt();

        System.out.println("Nome1: " + nome1 + ", Idade1: " + idade1);
        System.out.println("Nome2: " + nome2 + ", Idade2: " + idade2);

        scanner.close();
    }
}