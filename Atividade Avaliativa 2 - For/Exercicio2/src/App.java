import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite um número: ");
        int num = scanner.nextInt();
        int fatorial = 1;

        for (int i = num; i > 1; i--) {
            fatorial *= i;
            System.out.println(fatorial);
            
        }

        scanner.close();
    }
}
