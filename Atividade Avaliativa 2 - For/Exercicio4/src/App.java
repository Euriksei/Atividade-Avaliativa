public class App {
    public static void main(String[] args) {
        int cont = 0;
        int vetor[] = new int[100];
        while (cont < 100) {
            vetor[cont] = cont++;
        }
        //System.out.println(cont);
        for (int i = 0; i < vetor.length; i++) {
            int num = vetor[i];
            if (num % 2 != 0) {
                System.out.println(num);
            }
            
        }


    }
}
