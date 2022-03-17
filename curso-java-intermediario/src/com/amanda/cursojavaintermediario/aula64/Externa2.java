package com.amanda.cursojavaintermediario.aula64;

public class Externa2 {

    public void metodoQualquer(){

        // classe local só tem escopo dentro do próprio método
        class ClasseLocal{

            private String texto = "texto classe local";

            public void imprimeTexto(){
                System.out.println(texto);
            }
        }

        ClasseLocal local = new ClasseLocal();

        local.imprimeTexto();
    }

    public static void main(String[] args){

        Externa2 externa = new Externa2();

        externa.metodoQualquer();
    }
}
