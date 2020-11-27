# Padrão Template Method

## Centro Universitário UNIESP

### Professora: Drª Alana Morais (alanamm.prof@gmail.com)

### Aluno(a): Larissa Cauane de Souza Farias

## Nome
**Template Method**

## Problema
Classes diferentes que apresentam algoritmos com semelhanças significativas, mas não fazem a reutilização de uma interface ou de uma classe base em comum.

## Solução
Divida um algoritmo em uma série de etapas, as etapas que são comuns a todas as subclasses seram tranformadas em métodos e a chamada desses métedos ficaram dentro de um método padrão. Considere criar o método padrão como final para evitar as subclasses de sobrescrevê-lo e a criação de uma classe abstrata, para declarar o método padrão e métodos abstratos, que iram representar as etapas em comum das subclasses.

[Solução com código](https://github.com/larissacauane/Design-Patterns/tree/master/Design%20Patterns)

## Consequências
É um padrão fundamental para a reutilização de código. Além de conduzir a uma estrutura de inversão de controle, comumente conhecida como "o princípio de Hollywood", ou seja, "não me chame, nós chamaremos você". Seria como a classe mãe chama as operações da classe filha, e não contrário. Uma desvantagem desse padrão é a possibilidade da quebra do "Princípio de Substituição de Liskov".
