public class App {
    public static void main(String[] args) throws Exception {
        int[] vetor = {10,56,12,9,3,78,43,61,28,10};
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];

        }

        System.out.println(soma);

    }
}
