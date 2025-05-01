import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[15];
        Random random = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(50);
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+" ");
        }

        System.out.printf("\nDigite um número para verificar quantas vezes aparece: ");
        int num = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] == num){
                count++;
            }
        }

        System.out.printf("O núnmero selecionado aparece %d vezes", count);
        

        scanner.close();
    }
}
