import java.util.Scanner;


public class RevisaoA4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cadastrados = 0;

        int ID[] = new int[50];
        float PrecoCompra[] = new float[50];
        int QtdComprada[] = new int[50];
        float PrecoVenda[] = new float[50];
        int QtdVendida[] = new int[50];

        System.out.println("==== Análise de vendas ====");

            do{
                System.out.println("(Digite -1 para sair)");
                System.out.printf("\nDigite o ID do produto: #");
                int idDigitado = 0;

                if (scanner.hasNextInt()){
                    idDigitado = scanner.nextInt();
                } else {
                    System.out.println("Digite um número inteiro válido.");
                    scanner.next();
                }

                if (idDigitado == -1) {
                    System.out.println("######################");
                    System.out.println("Sistema encerrado");
                    System.out.println("######################");
                    //conferir aqui depois-----------------------------------
                    break;
                }

                ID[cadastrados] = idDigitado;
                System.out.printf("Digite o preço de compra do produto: R$");
                 float precoCompraDigitado = scanner.nextFloat();
                PrecoCompra[cadastrados] = precoCompraDigitado;

                System.out.printf("Digite a quantidade comprada: ");
                int QtdCompradaDigitada = scanner.nextInt();
                QtdComprada[cadastrados] = QtdCompradaDigitada;

                System.out.printf("Digite o preço de venda do produto: R$");
                float precoVendaDigitada = scanner.nextInt();
                PrecoVenda[cadastrados] = precoVendaDigitada;

                System.out.printf("Digite a quantidade vendida: ");
                int QtdVendidaDigitada = scanner.nextInt();
                QtdVendida[cadastrados] = QtdVendidaDigitada;
                
                System.out.println("---------------------------------");
                System.out.printf( (cadastrados + 1) + " Produto(s) Cadastrado --- ID:" + ID[cadastrados] + "\n");
                System.out.println("---------------------------------");
                cadastrados++;

                
            } while (cadastrados < 50);

            System.out.println("==== Relatório de vendas ====");
            System.out.println("ID\tBalanço\tLucro");
            System.out.println("-----------------------------");
            for (int i = 0; i < cadastrados; i++){
                float balanco = (PrecoVenda[i] * QtdVendida[i]) - (PrecoCompra[i] * QtdComprada[i]);
                String status = "";
                if (balanco > 0) {
                    status = "Sim";
                } else if (balanco < 0) {
                    status = "Não";
                } else {
                    status = "Neutro";
                }
                System.out.printf("%-10d\t%10.2f\t%-10s\n", ID[i], balanco, status);
                status = "";
            }
        scanner.close();
    }
}
