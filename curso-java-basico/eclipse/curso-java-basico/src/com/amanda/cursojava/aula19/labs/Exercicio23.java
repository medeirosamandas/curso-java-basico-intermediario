package com.amanda.cursojava.aula19.labs;

import java.util.Scanner;

/* Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que verifique se 
 * "todos" os elementos do vetor A s�o pares.
 * Se pelo menos um elemento do vetor n�o for par o processo de 
 * repeti��o para percorrer os elementos do vetor deve ser encerrado, como sugest�o:
 * utilize uma vari�vel do tipo flag para atingir este prop�sito*/


public class Exercicio23 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        
        for (int i=0; i<vetorA.length; i++){
            
            System.out.println("Entre com um n�mero para a posi��o " + i);
            vetorA[i] = scan.nextInt();
            
            if (vetorA[i] % 2 != 0){
                break;
            }
        }
    }    

}
