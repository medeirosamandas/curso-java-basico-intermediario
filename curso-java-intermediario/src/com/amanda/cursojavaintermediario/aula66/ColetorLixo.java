package com.amanda.cursojavaintermediario.aula66;

import com.amanda.cursojavaintermediario.aula61.Contato;

public class ColetorLixo {
    public static void obterMemoriaUsada(){
        final int MB = 1024 * 1024;
        Runtime runtime = Runtime.getRuntime(); //singleton
        System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB);
    }
    public static void main(String[] args) {
        Contato[] contatos = new Contato[1000000];
        Contato contato;
        for (int i = 0; i < contatos.length; i++){
            contato = new Contato("Contato " + i,
                    i + "9999999", i + "@mail.com");
            contatos[i] = contato;
        }
        System.out.println("Contatos criados");
        obterMemoriaUsada();
        contatos = null;

        // não é usual um programa que peça explicitamente o funcionamento
        // do garbage collector
        //profiling
        Runtime.getRuntime().runFinalization();
        Runtime.getRuntime().gc();

        System.out.println("Contatos removidos da memória");
        obterMemoriaUsada();

    }
}
