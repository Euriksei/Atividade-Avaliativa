import java.util.Scanner;

public class Pratica6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite um número para a soma 1: ");
        int num1 = scanner.nextInt();

        System.out.printf("Digite mais um número: ");
        int num2 = scanner.nextInt();

        System.out.printf("Digite um número para a soma 2: ");
        int num3 = scanner.nextInt();

        System.out.printf("Digite mais um número: ");
        int num4 = scanner.nextInt();

        System.out.println("Soma 1: " + (num1 + num2));
        System.out.println("Soma 2: " + (num3 + num4));

        scanner.close();
        
    }
}
