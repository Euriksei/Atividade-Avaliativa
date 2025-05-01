import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = {10, 5, 9, 7, 6, 0, 4, 1, 3, 2};

        System.out.print("Vetor original: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.print("\nEscolha um número para remover: ");
        int slct = scanner.nextInt();


        int posRemover = -1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == slct) {
                posRemover = i;
                break;
            }
        }

        int[] novoVetor = new int[vetor.length - 1];
        int j = 0;
        for (int i = 0; i < vetor.length; i++) {
        if (i != posRemover) {
            novoVetor[j] = vetor[i];
                j++;
            }
        }

        System.out.print("Vetor atualizado: ");
        for (int i = 0; i < novoVetor.length; i++) {
            System.out.print(novoVetor[i] + " ");
        }
    }


}

