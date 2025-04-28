import java.util.Scanner;

public class Pratica10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float dis1, dis2;

        System.out.printf("Distância do ponto 1: ");
        dis1 = scanner.nextFloat();
        System.out.printf("Distância do ponto 2: ");
        dis2 = scanner.nextFloat();
        
        float DistanciaEntre = dis1 - dis2;
        System.out.println("A distância entre os dois pontos é de: " + DistanciaEntre);

        scanner.close();

        
    }
}
