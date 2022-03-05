package com.amanda.cursojavaintermediario.aula56.labs;

/*Calculadora com Enum
* Escreva um Enum que represente as quatro operações matemáticas: SOMAR, SUBTRAIR, MULTIPLICAR
* E DIVIDIR.
* O Enum deve ter um construtor que recebe o símbolo da operação (+, -, *, /)
* Sobrescreva o método toString que retorne somente o símbolo da operação
* Implemente um método abstrato com a seguinte assinatura double executarOperacao(double x, double y)
* Cada opção do Enum deve implementar esse método realizando a operação de acordo com a sua descrição.
* Escreva um método main para teste que realize todas as operações do Enum.
* Dica: você pode usar o método values para iterar o Enum e executar todas as operações*/

public class Teste {

  public static void main(String[] args) {
    double soma = Enum.valueOf(Operacao.class, "SOMAR").executarOperacao(3, 6);
    double subtracao = Enum.valueOf(Operacao.class, "SUBTRAIR").executarOperacao(3, 6);
    double divisao = Enum.valueOf(Operacao.class, "DIVIDIR").executarOperacao(3, 6);
    double multiplicacao = Enum.valueOf(Operacao.class, "MULTIPLICAR").executarOperacao(3, 6);

    System.out.println(soma);
    System.out.println(subtracao);
    System.out.println(divisao);
    System.out.println(multiplicacao);

    double x = 2.0;
    double y = 3.0;

    for (Operacao op : Operacao.values()){
      System.out.print(x + " ");
      System.out.print(op.toString() + " ");
      System.out.print(y + " = ");
      System.out.println(op.executarOperacao(x, y));
  }
    }

}
