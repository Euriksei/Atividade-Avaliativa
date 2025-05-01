import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        int vetor1[] = new int[5];
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = random.nextInt(50);
        }

        int vetor2[] = new int[5];
        for (int i = 0; i < vetor1.length; i++) {
            vetor2[i] = random.nextInt(50);
        }
        
        System.out.println("Vetor 1:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor1[i]+" ");
        }

        System.out.println("\n");
        System.out.println("Vetor 2:");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print(vetor2[i]+" ");
        }
        
        int i = 0;
        int[] vetor3 = new int[10];

        for (int j = 0; j < vetor1.length; j++) {
            vetor3[i] = vetor1[j];
            i++;
        }

        for (int j = 0; j < vetor2.length; j++) {
            vetor3[i] = vetor2[j];
            i++;
        }

        System.out.println("\n");
        System.out.println("A união dos dois vetores é");
        for (int j = 0; j < vetor3.length; j++) {
            System.out.print(vetor3[j]+" ");
            
        }

    }
}
