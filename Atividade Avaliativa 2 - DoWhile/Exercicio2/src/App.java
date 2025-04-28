import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op = 0;
        System.out.println("Menu Interativo");
        System.out.println("---------------------");
        do {
            System.out.println("1 - Adicionar");
            System.out.println("2 - Remover");
            System.out.println("3 - Encerrar");
            System.out.println("---------------------");
            System.out.printf("Selecione: ");
            op = scanner.nextInt();
            if (op == 1) {
                System.out.println("Iten adicionado");
                System.out.println("---------------------");
            } else if (op == 2){
                System.out.println("Item removido");
                System.out.println("---------------------");
            } else if (op < 1 || op > 3){
                System.out.println("#########");
                System.out.println("Opção inválida. Tente novamente");
            }

            
        } while (op != 3);
        System.out.println("---------------------");
        System.out.println("Programa encerrado");
        System.out.println("---------------------");

        scanner.close();
    }
}
