package com.amanda.cursojavaintermediario.aula58;

public class TesteAutoboxing {


  public static void main(String[] args) {
  /* AUTOBOXING é o ato de não precisar chamar o construtor da classe para atribuir valor à variável
    ao invés de
    Integer num9 = new Integer(23424); , fica:
    */
    Integer num9 = 23424;
    // AUTO UN-BOXING

    int num3 = num9; // ao invés de num9.intValue();

    // autoboxing em expressoes
    num9++; // mesmo ele sendo Integer, dá pra fazer a expressão ++ nele

    System.out.println(num9);

    // é feito o auto unboxing num9 e depois autoboxing
    Integer num14 = num3/num9;
  }

}
