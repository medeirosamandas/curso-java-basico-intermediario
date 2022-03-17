package com.amanda.cursojavaintermediario.aula62;

/* varargs é o nome de um recurso da linguagem Java que permite que você passe infinitos parâmetros para um
   método sem ter que declarar todos os parâmetros */
public class ExemploVarargs {
    public static void main(String[] args) {
        System.out.println(soma(4, 3));
        System.out.println(soma(4, 3, 2));
        int[] vetor = {1, 2, 3, 4, 5};
        System.out.println(soma(vetor));
        System.out.println(soma(1, 2, 3, 4, 5));
    }

    static int soma(int a, int b){
        return a + b;
    }
    static int soma(int a, int b, int c){
        return a + b + c;
    }
    static int soma(int[] vetor){
        int total = 0;
        for(int i = 0; i < vetor.length; i++){
            total += vetor[i];
        }
        return total;
    }

    static int soma(Integer... vetor){
        int total = 0;
        for(int i = 0; i < vetor.length; i++){
            total += vetor[i];
        }
        return total;}
}
