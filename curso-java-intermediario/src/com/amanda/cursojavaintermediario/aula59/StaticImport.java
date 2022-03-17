package com.amanda.cursojavaintermediario.aula59;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

// ao importar estaticamente o método, não é necessário mais escrever Math.pow(), basta escrever pow()

public class StaticImport {

    public static void main(String[] args) {
        double a = 2;
        double b = 3;
        double c = 4;

        System.out.println(Math.pow(a, b));
        System.out.println(Math.sqrt(c));

        System.out.println();

        System.out.println(pow(a, b));
        System.out.println(sqrt(c));
    }
}
