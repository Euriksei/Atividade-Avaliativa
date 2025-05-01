import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in) ;   
        
        int i = 0;
        int maior = Integer.MIN_VALUE;
        int vetor[] = new int[15];
        
        do {
            System.out.println("Restantes: " + (15-i));
            System.out.printf("Digite um número: ");
            vetor[i] = scanner.nextInt();
            i ++;

        } while (i < 15);
        
        System.out.println("\n\n");

        for (int j = 0; j < vetor.length; j++) {
            if(vetor[j] > maior){
                maior = vetor[j];
            }
            
        }

        System.out.println("O maior número digitado foi: " +maior);


        
     scanner.close();   
    }
}
