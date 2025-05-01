import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int vetor[] = new int[8];
        
        do {
            System.out.printf("Digite um número: ");
            vetor[i] = scanner.nextInt();
            i ++;   
        } while (i < vetor.length);

        System.out.println("A ordem invertida do vetor é:");
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio < fim) {
            int temp = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = temp;
            
            inicio++;
            fim--;
        }

        System.out.println("\n\n");
        System.out.println("A ordem invertida do vetor é:");
        for (i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+", ");
            
        }

    }
}
