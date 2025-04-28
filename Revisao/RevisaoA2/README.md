# Exercício 2: Cadastro de Peças

## Enunciado:
Desenvolva um programa em Java que permita o cadastro de 10 peças fabricadas. Para cada peça, o usuário deverá informar:

- **Identificador numérico da peça** (um número inteiro positivo);
- **Quantidade produzida** (um número inteiro positivo entre 0 e 100);
- **Ação futura da peça**:
  - 1 — Aprovar;
  - 2 — Ajustar;
  - 3 — Sucatar.

O programa deve armazenar as peças em vetores distintos conforme a categoria informada. Assim, haverá três vetores: um para itens Aprovados, outro para itens que necessitam de Ajuste e um terceiro para peças que serão Sucatadas.

O programa deve validar as entradas utilizando os métodos `scanner.hasNextInt()` e `scanner.hasNextDouble()`. Caso o usuário digite um valor inválido, solicite a digitação novamente.

Após o encerramento do cadastro, exiba a listagem das peças cadastradas em cada categoria.

Em Java, é possível validar se a próxima entrada é um número inteiro utilizando o método `scanner.hasNextInt()`. Exemplo de validação de entrada:

```java
import java.util.Scanner;

public class ExemploValidacao {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    if (scanner.hasNextInt()) {
      int valor = scanner.nextInt();
      System.out.println("Valor digitado: " + valor);
    } else {
      System.out.println("Valor inválido!");
    }
  }
}
