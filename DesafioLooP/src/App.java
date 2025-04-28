import java.util.Scanner;

public class App {

    // Método para calcular capitalização simples
    public static float calcularSimples(float p, float r, int t) {
        return p * (1 + (r / 100) * t);
    }

    // Método para calcular capitalização composta
    public static float calcularComposta(float p, float r, int t) {
        return (float) (p * Math.pow(1 + (r / 100), t));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Rendimento");
        System.out.println("---------------------------");

        while (true) {
            // Entrada dos dados
            System.out.print("Valor do investimento inicial (P): ");
            float p = scanner.nextFloat();

            System.out.print("Taxa de juros anual (r): ");
            float r = scanner.nextFloat();

            System.out.print("Período de investimento em anos (t): ");
            int anos = scanner.nextInt();

            scanner.nextLine(); // limpar o buffer

            System.out.print("Tipo de capitalização (S para Simples, C para Composta): ");
            String capt = scanner.nextLine();

            float montante;

            // Escolher o tipo de capitalização
            if (capt.equalsIgnoreCase("S")) {
                montante = calcularSimples(p, r, anos);
                System.out.printf("Montante final com capitalização simples: %.2f\n", montante);

            } else if (capt.equalsIgnoreCase("C")) {
                montante = calcularComposta(p, r, anos);
                System.out.printf("Montante final com capitalização composta: %.2f\n", montante);

            } else {
                System.out.println("Opção inválida. Digite 'S' ou 'C'.");
                continue; // volta para o início do loop
            }

            // Perguntar se quer continuar
            System.out.print("\nDeseja realizar um novo cálculo? (1 - Sim / 2 - Não): ");
            int opcao = scanner.nextInt();
            if (opcao == 2) {
                System.out.println("\nEncerrando o programa. Obrigado!");
                break;
            }
            System.out.println("\nIniciando novo cálculo...");
            System.out.println("---------------------------\n");
        }

        scanner.close();
    }
}
