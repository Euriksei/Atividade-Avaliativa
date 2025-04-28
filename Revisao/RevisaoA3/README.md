# Exercício 3: Controle de Embarque de Produtos em um Container

## Enunciado:
Desenvolva um programa em Java para controlar o embarque de produtos em um container. A capacidade total do container (em kg) deve ser informada pelo usuário no início da execução. O programa deverá solicitar ao usuário o peso individual (em kg) e a quantidade dos itens a serem embarcados. O processo de embarque deve continuar até que:

1. O usuário digite um peso negativo (indicando o fim do embarque);
2. Ou a capacidade total do container seja atingida.

### Regras:
- O peso total embarcado **não pode ultrapassar** a capacidade informada;
- O embarque **só será autorizado** se o peso total final for **igual ou maior que 80%** da capacidade do container;
- A cada novo item informado, o programa deve exibir:
  - A capacidade total do container;
  - O peso total já embarcado (em kg e em percentual);
  - Se o embarque está autorizado ou não naquele momento;
- Caso o peso total embarcado não atinja o mínimo exigido de 80% após o encerramento, o programa deve exibir uma mensagem informando que o embarque não foi autorizado por peso insuficiente;
- Caso a capacidade máxima seja atingida **exatamente**, o embarque deve ser encerrado automaticamente, sem permitir a inclusão de novos itens;
- Não é permitido ultrapassar a capacidade máxima do container. Para esses casos, informe que **não foi possível inserir o produto** pelo excesso de peso.

### Saída:
Ao final do processo, exiba:
- O peso total embarcado;
- A quantidade total de itens;
- Uma mensagem informando se o embarque foi autorizado ou não.
