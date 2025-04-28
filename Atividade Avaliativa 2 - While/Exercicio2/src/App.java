import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int numero;

        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        while (numero >= 0) {
            soma += numero;
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
        }

        System.out.println("A soma dos números positivos é: " + soma);

        scanner.close();
    }
}
