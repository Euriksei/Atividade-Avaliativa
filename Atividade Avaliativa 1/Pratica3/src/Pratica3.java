import java.util.Scanner;

public class Pratica3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite um nome: ");
        String nome1 = scanner.nextLine();
        System.out.printf("Digite outro nome: ");
        String nome2 = scanner.nextLine();

        System.out.println("Nome 1: " + nome1);
        System.out.println("Nome 2: " + nome2);

        scanner.close();

    }
}
