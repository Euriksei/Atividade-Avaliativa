public class App {
    public static void main(String[] args) throws Exception {

        int vetor1[] = {6,9,7,2,25,10};
        int vetor2[] = {6,25,10,7,5,9};
        
        System.out.println("Vetor 1:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor1[i]+" ");
        }

        System.out.println("\n");
        System.out.println("Vetor 2:");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print(vetor2[i]+" ");
        }


        int count = 0;

        for (int i = 0; i < vetor1.length; i++ ) {
            for (int j = 0; j < vetor2.length; j++) {
                if (vetor1[i] == vetor2[j]) {
                    count++;
                }
            }          
        }
        System.out.println("\n");
        System.out.println(count);

        int[] vetor3 = new int[count];
        count =0;
        for (int i = 0; i < vetor1.length; i++) {
            for (int j = 0; j < vetor2.length; j++) {
                if (vetor1[i] == vetor2[j]) {
                    vetor3[count] = vetor1[i];
                    count++;
                    
                }
            }
        }

        System.out.println("A interceção dos dois vetores é:");
        for (int i = 0; i < vetor3.length; i++) {
            System.out.print(vetor3[i]+" ");
        }
    }
}