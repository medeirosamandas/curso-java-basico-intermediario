package com.amanda.cursojava.aula19.labs;

import java.util.Scanner;

/* Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A e a rela��o de todos os pares de 0 at� o respectivo elemento*/

public class Exercicio34 {
	
	  
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        
        for (int i=0; i<vetorA.length; i++){
            
            System.out.println("Entre com o valor da posi��o A - " + i);
            vetorA[i] = scan.nextInt();
        }
        
        for (int i=0; i<vetorA.length; i++){
            
            System.out.println("Analizando o n�mero " + vetorA[i]);
            
            for (int j=2; j<vetorA[i]; j++){
                if (j % 2 == 0){
                    System.out.println(j + " � par");
                }
            }
            
            System.out.println();
        }
    }    

}
