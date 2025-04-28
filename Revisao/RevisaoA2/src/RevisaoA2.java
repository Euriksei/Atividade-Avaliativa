import java.util.Scanner;
import java.util.ArrayList;

public class RevisaoA2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis para incrementar e conseguir armazenar as peças
        // nas posiçoes corretas dos vetores
        int aprovadas = 0;
        int ajustadas = 0;
        int sucateadas = 0;

        // Variável para controlar o número de peças cadastradas
        int PecasCadastradas = 0;

        // Lista para armazenar os IDs das peças
        ArrayList<Integer> pecas = new ArrayList<>();

        //Lista para armazenar a quantidade de peças
        ArrayList<Integer> qtd = new ArrayList<>();

        // Vetores para armazenar os IDs das peças de acordo com o status
        int[] aprovar = new int[10];
        int[] ajustar = new int[10];
        int[] sucatar = new int[10];

        //loop para cadastrar as peças
        while (PecasCadastradas < 10) {
            int id = 0;
            int status = 0;
            System.out.printf("Digite o ID da peça: #");

            // Verifica se o ID é um número inteiro
            while (!scanner.hasNextInt()) {
                System.out.println("--------------------");
                System.out.println("ID inválido. Digite um número inteiro: ");
                System.out.printf("Digite o ID da peça: #");
                scanner.next(); // Limpa o scanner
            }

            // Lê o ID da peça
            id = scanner.nextInt();
            if (pecas.contains(id)) {
                System.out.println("--------------------");
                System.out.println("ID já cadastrado. Tente novamente.");
                continue; // Pula para a próxima iteração do loop
            } else {
                pecas.add(id); // Adiciona o ID à lista de peças
                System.out.printf("Peça #%d cadastrada\n", id);
                System.out.println("--------------------");
            }
            
            //Pede a quantidade de peças
            System.out.printf("Digite a quantidade de peças: ");
            // Verifica se a quantidade é um número inteiro
            while (!scanner.hasNextInt()) {
                System.out.println("--------------------");
                System.out.println("Quantidade inválida. Digite um número inteiro: ");
                System.out.printf("Digite a quantidade de peças: ");
                scanner.next(); // Limpa o scanner
            }
            // Lê a quantidade de peças
            int quantidade = scanner.nextInt();

            while (quantidade <= 0 || quantidade > 100) {
                System.out.println("--------------------");
                System.out.println("Quantidade inválida. Digite um numero entre 1 e 100.");
                
                while (!scanner.hasNextInt()) {
                    System.out.println("Entrada inválida. Digite um número inteiro.");
                    scanner.next(); // Limpa a entrada inválida
                }

                quantidade = scanner.nextInt(); // Lê novamente a quantidade
                
                
            }  

             // Adiciona a quantidade à lista de peças
            qtd.add(quantidade);
            System.out.printf("Quantidade de peças #%d cadastrada\n", id);
            System.out.println("--------------------");
            

            // solicita o status da peça
            System.out.printf("Digite o status da peça (1 - Aprovar, 2 - Ajustar, 3 - Sucatar): ");

            //verifica se o status é um número inteiro
            while (!scanner.hasNextInt()) {
                System.out.println("--------------------");
                System.out.println("Status inválido. Digite 1, 2 ou 3: ");
                System.out.printf("Digite o status da peça (1 - Aprovar, 2 - Ajustar, 3 - Sucatar): ");
                scanner.next();
            }

            // Lê o status da peça
            status = scanner.nextInt();
            while (status < 1 || status > 3) {
                System.out.println("--------------------");
                System.out.println("Status inexistente ");
                System.out.printf("Digite o status da peça (1 - Aprovar, 2 - Ajustar, 3 - Sucatar): ");
                status = scanner.nextInt(); // Limpa o scanner
            }

            // Verifica o status da peça e armazena no vetor correspondente
            // e incrementa o contador de peças cadastradas de cada vetor
            switch (status) {
                case 1:
                aprovar[aprovadas] = id;
                aprovadas++;
                System.out.printf("Peça #%d aprovada\n", id);
                break;

                case 2:
                ajustar[ajustadas] = id;
                ajustadas++;
                System.out.printf("Peça #%d marcada para ajustar\n", id);
                break;

                case 3:
                sucatar[sucateadas] = id;
                sucateadas++;
                System.out.printf("Peça #%d marcada para sucatear\n", id);
                break;

            }

            PecasCadastradas++;
            
            System.out.println("--------------------");
            System.out.printf("Peças cadastradas: %d\n", PecasCadastradas);
            System.out.println("--------------------");

            }

        System.out.println("---------------------");
        System.out.printf("Peças aprovadas: %d\n", aprovadas);
        for (int i = 0; i < aprovadas; i++) {
            int id = aprovar[i];
            int index = pecas.indexOf(id); // Encontra o índice do ID na lista de peças
            int quantidade = qtd.get(index); // Obtém a quantidade correspondente
            System.out.println("ID : #" + id + " - Quantidade: " + quantidade);

        }
        System.out.println("---------------------");
        System.out.printf("Peças ajustadas: %d\n", ajustadas);
        for (int i = 0; i < ajustadas; i++) {
            int id = ajustar[i];
            int index = pecas.indexOf(id);
            int quantidade = qtd.get(index);
            System.out.println("ID : #" + id + " - Quantidade: " + quantidade);
        }

        System.out.println("---------------------");
        System.out.printf("Peças sucateadas: %d\n", sucateadas);
        for (int i = 0; i < sucateadas; i++) {
            int id = sucatar[i];
            int index = pecas.indexOf(id);
            int quantidade = qtd.get(index);
            System.out.println("ID : #" + id + " - Quantidade: " + quantidade);
        }

        System.out.println("---------------------");
        System.out.println("Sistema encerrado.");

        scanner.close();
        }          
    }