package com.amanda.cursojava.aula19.labs;

import java.util.Scanner;

/*Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada
 * elemento do vetor B deverá ser o resto da divisão do respectivo elemento de A por 2 (dois), ou seja:
 * B[i] := A[i] % 2*/

public class Exercicio10 {
	 public static void main(String[] args) {
		

			Scanner sc = new Scanner(System.in);
			
			int[] vetorA = new int[10];
			int[] vetorB = new int[vetorA.length];

			
			System.out.println("Insira " + vetorA.length + " valores");
			
			for(int i = 0; i < vetorA.length; i++) {
				vetorA[i] = sc.nextInt();
				
				vetorB[i] = vetorA[i] % 2;
			}
			
			System.out.println("Vetor A");
			
			for (int i = 0; i < vetorA.length; i++) {
				System.out.println(vetorA[i]);
			}
			

			System.out.println("\n Vetor B");
			
			for (int i = 0; i < vetorA.length; i++) {
		        System.out.println(vetorB[i]);
			}
	
	 }
	
        
 
}
