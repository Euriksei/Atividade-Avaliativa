import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculo de médias");
        System.out.println("-------------------");
        int i = 0;
        float nota, soma = 0, media;
        String continuar = "s";
        
        do {
            System.out.printf("Insira a nota do aluno: ");
            nota = scanner.nextFloat();
            soma += nota;
            scanner.nextLine();
            
            System.out.printf("Deseja adicionar mais notas ?: ");
            continuar = scanner.nextLine();
            i++;
            
        } while (!continuar.equals("n") && !continuar.equals("N"));
        media = soma/i;
        System.out.println("-------------------");
        System.out.println("A media das notas foi: " + media);
        scanner.close();


    }
}
