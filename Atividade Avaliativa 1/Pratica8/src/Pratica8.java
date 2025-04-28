import java.util.Scanner;

public class Pratica8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cidade;
        float distancia, autonomia, valorGas;
        
        System.out.printf("Digite o nome da cidade destino: ");
        cidade = scanner.nextLine();

        System.out.printf("Distância da sua casa ao destino em Km: ");
        distancia = scanner.nextFloat();

        System.out.printf("Autonomia do seu carro: ");
        autonomia = scanner.nextFloat();

        System.out.printf("Valor da gasolina: ");
        valorGas = scanner.nextFloat();

        float CustoViagem = (distancia * autonomia) * valorGas;

        System.out.println("Destino: " + cidade);
        System.out.println("Custo da viajem: " + CustoViagem);

        scanner.close();
    }
}
