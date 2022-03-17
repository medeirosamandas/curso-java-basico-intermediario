package com.amanda.cursojavaintermediario.aula63;

public class ExemploPrintf {
    public static void main(String[] args) {

       // %s concatenar ou só apresentar a string
        System.out.printf("Hello %s", "Olá mundo");
        System.out.println();
        // %S concatenar e transformar o texto em caixa alta
        System.out.printf("Hello %S", "Olá mundo");
        System.out.println();

        // %c concatenar ou só apressentar o caractere
        System.out.printf("Hello %c", 'c');
        System.out.println();
        // %C concatenar e transformar o caracter em caixa alta
        System.out.printf("Hello %C", 'c');
        // %n pular linha
        System.out.printf("%n");

        int valor = 123456789;
        // %d formatar valor inteiro
        System.out.printf("%d", valor);

        System.out.println();
        // %f formatar ponto flutuante
        double pontoFlutuante = 3.1456789;
        System.out.printf("%f", pontoFlutuante);

        System.out.println();

        String olaMundo = "Olá, Mundo!";
        // define a quantidade total de caracteres a serem exibidos,
        // completando com espaços antes da string
        System.out.printf("%20s", olaMundo);

        System.out.println();
        // define a quantidade total de caracteres a serem exibidos,
        // completando com espaços DEPOIS da string
        System.out.printf("%-20s", olaMundo);

        System.out.println();
        // insere o símbolo + ou -, dependendo do valor do inteiro
        System.out.printf("%+d", valor);

        System.out.println();
        // define a quantidade total de caracteres a serem exibidos,
        // completando com ZEROS antes do valor inserido
        System.out.printf("%015d", valor);

        System.out.println();
        // insere o ponto ou vírgula (dependendo da configuração)
        // para separar as casas de milhares, milhão do número
        System.out.printf("%,d", valor);

        System.out.println();
        // insere o ponto ou vírgula (dependendo da configuração)
        // para separar as casas de milhares, milhão do número
        System.out.printf("%,f %n", pontoFlutuante);

        System.out.println("--------");

        int valor2 = -123456789;
        System.out.printf("% d", valor2);
        System.out.println();
        System.out.printf("% d", valor);

        System.out.println();

        // define a precisao depois do ponto flutuante
        System.out.printf("%.3f", pontoFlutuante);

        System.out.println();

        // insere o R$ na frente, 10 caracteres entre o R$ e a vírgula
        // e duas casas depois da vírgula
        System.out.printf("R$%10.2f", pontoFlutuante);

        System.out.println();

        testeMaisCompleto();

    }

    private static void testeMaisCompleto(){

        double[] precos = {10000, 123.54, 7843.567, 1, 4.56789};

        for (int i=0; i<precos.length; i++){
            System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);
        }

        //Java.util.Formater
    }
}
