import java.util.Scanner;

public class RevisaoA3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.println("Sistema de embarque de mercadorias");
        System.out.printf("Digite a capacidade maxima do container em Kg: ");
        float capacidadeMaxima = scanner.nextFloat();

        boolean embarquePermitido = false;
        int UndMercadoria = 0;
        float pesoMercadoria = 0;

        float pesoTotal = 0;
        int UndTotal = 0;


        while (true) {
            float porcentagemPreenchida = (pesoTotal / capacidadeMaxima) * 100;
            System.out.println("-------------------------------");
            if (!embarquePermitido){
                System.out.println("Embarque não permitido!");
            } else {
                System.out.println("Embarque autorizado!");
            }

            System.out.println("Peso atual: " + pesoTotal + "Kg");
            System.out.println("Capacidade disponivel: " + (capacidadeMaxima - pesoTotal) + "Kg");
            System.out.printf("Capacidade preenchida: %.2f%%\n", porcentagemPreenchida);
            System.out.printf("(Para sair digite -1)\nDigite a quantidade da mercadoria: ");

            UndMercadoria = scanner.nextInt();

            if (UndMercadoria == -1) {
                if (embarquePermitido) {
                    System.out.println("--------------------------------");
                    System.out.println("Programa encerrado");
                    System.out.println("Embarque autorizado!");
                    break;
                } else {
                    System.out.println("Você ainda não pode sair. Capacidade mínima de 80% ainda não atingida.");
                    continue; // volta pro início do loop
                }
            }
            
            UndTotal += UndMercadoria;
            
            System.out.printf("Digite o peso da mercadoria em Kg: ");
            pesoMercadoria = scanner.nextFloat();
            pesoTotal += pesoMercadoria * UndMercadoria;
            if (pesoTotal > capacidadeMaxima){
                System.out.println("Não foi possivel inserir o produto pelo execesso de peso");
                UndTotal -= UndMercadoria;
                pesoTotal -= pesoMercadoria * UndMercadoria;
                System.out.println("----------------------------------");
            }
            
            //verificar se o peso embarcado é igual ou maior 80% da capacidade maxima
            if (pesoTotal >= 0.8 * capacidadeMaxima) {
                embarquePermitido = true;
                System.out.println("--------------------------------");
                System.out.println("Capacidade mínima atingida");
            }

            if (pesoTotal == capacidadeMaxima) {
                System.out.println("--------------------------------");
                System.out.println("Programa encerrado");
                System.out.println("Capacidade máxima atingida!");
                break;
                
            }

            if (UndMercadoria == -1 && embarquePermitido == true) {
                pesoTotal -= pesoMercadoria;
                System.out.println("--------------------------------");
                System.out.println("Programa encerrado");
                System.out.println("Embarque autorizado!");
                break;//ficar esperto aquiii
            } 
            
        }
        System.out.println("Peso total: " + pesoTotal + "Kg");
        System.out.println("Quantidade total de mercadorias: " + UndTotal);
        System.out.printf("Capacidade restante: %.2fKg\n", (capacidadeMaxima - pesoTotal));
        float porcentagemPreenchida = (pesoTotal / capacidadeMaxima) * 100;
        System.out.printf("Capacidade preenchida: %.2f%%\n", porcentagemPreenchida);
        
        scanner.close();
        
    }
    
}
