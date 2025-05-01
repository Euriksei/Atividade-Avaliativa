import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int vetor[] = new int[20];
        int par = 0;
        
        do {
            System.out.printf("Digite um número: ");
            vetor[i] = scanner.nextInt();
            i ++;
            
        } while (i < 20);

        for (i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                par += 1;
            }
            
        }
        System.out.printf("Foram inseridos %d números pares", par);
        

        scanner.close();
    }
    
}
