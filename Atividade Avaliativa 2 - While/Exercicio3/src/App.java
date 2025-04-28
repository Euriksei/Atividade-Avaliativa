import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senha = 1234;
        int chute;

        System.out.printf("Digite a senha: ");
        chute = scanner.nextInt();

        while (chute != senha) {
            System.out.println("Senha incorreta.");
            System.out.printf("Tente novamente: ");
            chute = scanner.nextInt();
            
        }

        System.out.println("Acesso concedido");
        scanner.close();
    }
}
