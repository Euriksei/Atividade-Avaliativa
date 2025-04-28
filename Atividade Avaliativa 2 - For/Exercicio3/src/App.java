import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont = 0, soma =0, num;
        int vetor[] = new int[10];

        while (cont < 10) {
            System.out.printf("Digite um numero: ");
            vetor[cont] = scanner.nextInt();
            cont++;
        }

        for (int i = 0; i < vetor.length; i++) {
            num = vetor[i];
            soma += num;
            
        }

        System.out.println("A soma dos números é "+soma);
        scanner.close();

    }
}
