# Padrão Template Method

## Centro Universitário UNIESP

### Professora: Drª Alana Morais (alanamm.prof@gmail.com)

### Aluno(a): Larissa Cauane de Souza Farias

## Nome
**Template Method** define os passos de um algoritmo e permite que a implementação de um ou mais passos seja fornecida por subclasses. Assim, esse padrão proteje o algoritmo e fornece métodos abstratos para as subclasses implemetarem.

A definição oficial do Template Method é: "Definir o esqueleto de um algoritmo em uma operação, postergando alguns passos para as subclasses. Template Method permite que subclasses redefinam certos passos de um algoritmo sem mudar a estrutura do mesmo."

O Template Method permite a reutilização de código sem perder o controle dos algortimos.

## Problema
Classes diferentes que apresentam algoritmos com semelhanças significativas, mas não fazem a reutilização de uma interface ou de uma classe base em comum.

## Solução
Dividir um algoritmo em uma série de etapas, as etapas que são comuns a todas as subclasses seram tranformadas em métodos e a chamada desses métodos ficaram dentro de um método padrão. O método padrão tem que ser definido como final para evitar as subclasses de sobrescrevê-lo. E a criação de uma classe abstrata, para declarar o método padrão e os métodos abstratos, que iram representar as etapas em comum das subclasses.

[Solução com código](https://github.com/larissacauane/Design-Patterns/tree/master/Design%20Patterns)

## Consequências

### Prós
- É um padrão fundamental para a reutilização de código.
- Conduz a uma estrutura de inversão de controle, comumente conhecida como "o princípio de Hollywood", ou seja, "não me chame, nós chamaremos você". Se refere a como uma classe mãe chama as operações de uma subclasse, e não contrário. 

### Contras
- Possibilidade da violação do "Princípio de Substituição de Liskov".
- As implementações do Template Method podem ser mais difíceis de se manter dependendo da quantidade de etapas que eles tiverem.
