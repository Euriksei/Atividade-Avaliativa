import java.util.Scanner;

public class Pratica7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome1, nome2, nome3, nome4, nome5, nome6;
        int idade1, idade2, idade3, idade4, idade5, idade6;

        System.out.printf("Digite o nome 1: ");
        nome1 = scanner.nextLine();
        System.out.printf("Digite a idade: ");
        idade1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("");
        
        System.out.printf("Digite o nome 2: ");
        nome2 = scanner.nextLine();
        System.out.printf("Digite a idade: ");
        idade2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("");

        System.out.printf("Digite o nome 3: ");
        nome3 = scanner.nextLine();
        System.out.printf("Digite a idade: ");
        idade3 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("");

        System.out.printf("Digite o nome 4: ");
        nome4 = scanner.nextLine();
        System.out.printf("Digite a idade: ");
        idade4 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("");

        System.out.printf("Digite o nome 5: ");
        nome5 = scanner.nextLine();
        System.out.printf("Digite a idade: ");
        idade5 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("");

        System.out.printf("Digite o nome 6: ");
        nome6 = scanner.nextLine();
        System.out.printf("Digite a idade: ");
        idade6 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("");

        int soma = idade1 + idade2 + idade3 + idade4 + idade5 + idade6;
        double media = soma/6;

        System.out.println("Nome: " + nome1 + "- idade: "+ idade1);
        System.out.println("Nome: " + nome2 + "- idade: "+ idade2);
        System.out.println("Nome: " + nome3 + "- idade: "+ idade3);
        System.out.println("Nome: " + nome4 + "- idade: "+ idade4);
        System.out.println("Nome: " + nome5 + "- idade: "+ idade5);
        System.out.println("Nome: " + nome6 + "- idade: "+ idade6);

        System.out.println("A soma das idades é: " +soma);
        System.out.println("A media das idades é: " + media);


        


        scanner.close();
    }
}
