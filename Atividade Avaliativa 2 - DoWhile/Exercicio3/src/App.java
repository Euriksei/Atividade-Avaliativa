import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jogo de adivinhação!");
        Random random = new Random();
        int num = random.nextInt(21);
        int chute;
        System.out.println(num);

        do {
            System.out.printf("Tente adivinhar o número: ");
            chute = scanner.nextInt();

            if (chute != num) {
                System.out.println("Errou! Tente novamente");
                
            }
            
        } while (chute != num);

        System.out.println("Parabêns, você acertou o número");
        System.out.println(num);

        scanner.close();

        

    }
}
