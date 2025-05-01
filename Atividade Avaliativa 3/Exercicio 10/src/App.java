import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite um número: ");
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor [i]+" ");
        }

        // Algoritmo Bubble Sort
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // Troca os elementos
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    }
                }
            }
        
            System.out.println("\nVetor ordenado:");
            for (int num : vetor) {
                System.out.print(num + " ");
            }

        
        }
        

    


    }


    

