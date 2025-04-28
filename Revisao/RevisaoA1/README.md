# Exercício 1: Jogo de Adivinhação

## Enunciado:
Desenvolva um programa em Java que gere um número aleatório de 1 a 100 e peça ao usuário para adivinhar qual é esse número. O programa deve informar se o número digitado pelo usuário é maior ou menor que o número gerado aleatoriamente. O jogo continua até que o usuário acerte o número ou atinja o número máximo de 10 tentativas. Ao final, exiba uma mensagem informando se o usuário venceu (acertou o número) ou perdeu (caso não tenha acertado dentro das 10 tentativas). Informe ainda todos os números digitados pelo usuário e qual foi o número sorteado.

Em Java, é possível gerar um número aleatório utilizando a classe Random. Exemplo de geração de um número aleatório entre 1 e 100:

```java
import java.util.Random;

public class Exemplo {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        System.out.println("Número gerado: " + numeroAleatorio);
    }
}
