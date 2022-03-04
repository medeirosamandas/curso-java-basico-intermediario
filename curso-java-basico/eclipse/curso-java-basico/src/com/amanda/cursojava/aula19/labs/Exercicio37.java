package com.amanda.cursojava.aula19.labs;

import java.util.Scanner;

/* Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, sendo que cada 
 * elemento do vetor B seja o fatorial do elemento correspondente em A.*/

public class Exercicio37 {
	
	   
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];
        
        for (int i=0; i<vetorA.length; i++){
            
            System.out.println("Entre com o valor da posi��o A - " + i);
            vetorA[i] = scan.nextInt();
        }
        
        for (int i=0; i<vetorA.length; i++){
            
            vetorB[i] = 1; //opcional
            for (int j=1; j<=vetorA[i]; j++){
                vetorB[i] *= j;
            }
        }
        
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        
        System.out.print("Vetor B = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
    }    

}
