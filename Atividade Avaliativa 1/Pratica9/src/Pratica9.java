import java.util.Scanner;

public class Pratica9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float altura, peso, IMC;
        System.out.printf("Informe sua altura em metros: ");
        altura = scanner.nextFloat();
        System.out.printf("Infome seu peso em Kg: ");
        peso = scanner.nextFloat();

        IMC = peso/(altura*altura);
        System.out.printf("Seu IMC é: " + IMC);
        
        scanner.close();
    }
}
