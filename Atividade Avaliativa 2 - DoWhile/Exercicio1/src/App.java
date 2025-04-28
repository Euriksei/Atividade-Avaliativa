import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num =0;

        do {
            System.out.printf("Digite um numero: ");
            num = scanner.nextInt();
            
        } while (num >= 0 && num <=50);

        System.out.println("Número fora do intervalo.");
        scanner.close();
    }
}
