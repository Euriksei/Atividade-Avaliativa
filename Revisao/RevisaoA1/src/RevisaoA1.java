import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RevisaoA1 {
    public static void main(String[] args){

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner ler = new Scanner(System.in);

        // Cria um objeto Random para gerar números aleatórios
        Random random = new Random();
        // Gera um número aleatório entre 1 e 100
        int num = random.nextInt(100) + 1;
        

        int palpite = 0;
        int tentativas = 0;
        //System.out.println("Número gerado: " + num); // Para depuração, descomente para ver o número gerado

        //Solicita o palpite do usuário e cria uma lista para armazenar os chutes
        System.out.println("Adivinhe o número entre 1 e 100: ");
        ArrayList<Integer> chutes = new ArrayList<>();

       do{
        //lê o palpite do usuário
        palpite = ler.nextInt();

            if (palpite == num){
                chutes.add(palpite);
                System.out.println("------------------");
                System.out.println("Parabéns! Você acertou o número!");
                System.out.println("chutes: " + chutes);
                System.out.printf("O número era %d\n", num);
                System.out.printf("Você fez %d tentativas\n", tentativas + 1);
                break;
            }

            if (palpite < num){
                System.out.println("------------------");
                System.out.printf("O número é maior que %d\n", palpite);
                tentativas++;
                System.out.printf("Restam %d tentativas\n", (10 - tentativas));
                
            } 
            
            else {
                System.out.println("------------------");
                System.out.printf("O número é menor que %d\n", palpite);
                tentativas++;
                System.out.printf("Restam %d tentativas\n", (10 - tentativas));
            }

            chutes.add(palpite);
            System.out.println("Chutes: " + chutes);

        } while (tentativas < 10 && palpite != num);

        
        if (palpite != num) {
            System.out.printf("Suas tentativas acabaram! O número era %d\n", num);
        }

        ler.close();


    }
}
