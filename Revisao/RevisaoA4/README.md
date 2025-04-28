# Exercício 4: Análise das Vendas de Produtos de uma Loja

## Enunciado:
Desenvolva um programa em Java para realizar a análise das vendas de produtos de uma loja. O sistema deverá permitir o cadastro de um conjunto de produtos. Para cada produto, o usuário deverá informar:

1. Identificador numérico do produto (um número inteiro positivo);
2. Preço de compra;
3. Quantidade comprada;
4. Preço de venda;
5. Quantidade vendida.

O programa deve suportar um cadastro de até 50 produtos. O cadastro de produtos deverá ser encerrado quando o sistema atingir o limite ou quando o usuário digitar `-1` como identificador.

Após o cadastro, o programa deve exibir um relatório final contendo, para cada produto:

- Identificador do produto;
- Balanço financeiro do produto: 
  \[
  (\text{{preço de venda}} \times \text{{quantidade vendida}}) - (\text{{preço de compra}} \times \text{{quantidade comprada}})
  \]
- Classificação do produto:
  - Lucrativo: se o balanço for positivo.
  - Não lucrativo: se o balanço for negativo.
  - Neutro: se o balanço for igual a 0.

O programa também deve identificar e exibir:

- O produto mais lucrativo;
- O produto menos lucrativo (ou o mais deficitário).

### Regras:
- O sistema deve suportar até 50 produtos.
- O cadastro de produtos é encerrado quando o número de produtos atinge o limite ou o usuário digita `-1` como identificador do produto.
- O programa deve exibir um relatório com os dados de cada produto, incluindo o balanço financeiro e sua classificação.

### Saída:
Ao final, o programa deve exibir um relatório contendo:

- Para cada produto:
  - Identificador;
  - Balanço financeiro;
  - Classificação (Lucrativo, Não lucrativo, Neutro).
  
- O produto mais lucrativo.
- O produto menos lucrativo (ou o mais deficitário).
