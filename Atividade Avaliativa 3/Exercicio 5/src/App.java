import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        float vetor[] = new float[12];
        int i = 0;
        float media;
        int qtd = 0;
        float nota = 0;

        do {
            System.out.printf("Digite uma nota: ");
            vetor[i] = scanner.nextFloat();
            i++;
        } while (i < 12);

        for (i = 0; i < vetor.length; i++) {
            nota += vetor[i];       
        }

        media = nota / vetor.length;
        System.out.println("A média das notas é: " + media);
        
        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] > media) {
                qtd++;
            }
        }
        System.out.println("A quantidade de notas maiores que a media foi: "+ qtd);
        scanner.close();

        
    }
}
