package com.amanda.cursojavaintermediario.aula57;

public class TesteWrapper {

  public static void main(String[] args) {
    // tipos primitivos
    short num1 = 1;
    byte num2 = 10;
    int num3 = 100;
    long num4 = 100001;
    float num5 = 3.5f;
    double num6 = 3.5555;
    boolean flag = true;
    char a = 'a';

    Short num7 = (short) 3;
    Byte num8 = (byte) num2;
    Integer num9 = 1000;
    Long num10 = 9837982L;
    Float num11 = 3.8f;
    Double num12 = 32.98;
    Boolean flag2 = true;
    Character b = 'b';

    // metodo que 'transforma' o tipo do do elemento
    Long num13 = num8.longValue();
    // transforma string em int ou double ou qualquer outro
    int num14 = Integer.parseInt("9238");
    double num15 = Double.parseDouble("324.3");

    Integer num16 = Integer.valueOf(1342);


    // não da pra fazer comparação de wrappers com == pois os tipos são classes
    System.out.println(num16);
  }

}
