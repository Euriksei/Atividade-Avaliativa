Desenvolva um programa que funcione como uma **calculadora de rendimento para aplicações financeiras**, permitindo que o usuário realize **diversos cálculos em sequência** por meio de um **loop**. A cada iteração, o programa deve:

1. **Solicitar** ao usuário
    - O valor do investimento inicial (*P*);
    - A taxa de juros anual (*r*);
    - O período de investimento em anos (*t*);
    - A opção de **capitalização** (simples ou composta).

2. **Calcular** o **montante** (*M*) ao final do período, utilizando:
    - **Capitalização simples**:
      $$M = P \times \left(1 + \frac{r}{100} \times t\right)$$
    - **Capitalização composta**:
      $$M = P \times \left(1 + \frac{r}{100}\right)^t$$

3. **Exibir** o valor do montante calculado, de forma organizada.

4. **Perguntar** se o usuário deseja realizar um novo cálculo. Se a resposta for positiva, o programa deve **repetir** todo o processo (retornando ao passo 1). Caso contrário, o programa deve **encerrar** a execução.

### Observações adicionais

- Utilize **funções ou métodos** para organizar o código e facilitar a manutenção.
- Inclua comentários relevantes para explicar cada parte do código.
- O programa pode ser desenvolvido em **Java, Python, C#, C++ ou Rust**.
- **Versione** seu código em um repositório no **GitHub**.
- Certifique-se de que o resultado final seja **exibido na tela** de forma clara ao final de cada iteração.
