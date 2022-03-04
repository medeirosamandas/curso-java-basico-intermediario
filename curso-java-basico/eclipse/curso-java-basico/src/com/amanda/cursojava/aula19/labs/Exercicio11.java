package com.amanda.cursojava.aula19.labs;

import java.util.Scanner;

/*Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a quantidade
 * de elementos armazenados neste vetor que são pares*/

public class Exercicio11 {
	
	 public static void main(String[] args) {
			

			Scanner sc = new Scanner(System.in);
			
			int[] vetorA = new int[10];
			int pares = 0;
			int impares = 0;

			
			System.out.println("Insira " + vetorA.length + " valores");
			
			for(int i = 0; i < vetorA.length; i++) {
				vetorA[i] = sc.nextInt();
				if (vetorA[i] % 2 == 0) {
					pares++;
				}else {
					impares++;
				}
				
			}
			
			System.out.println("Vetor A");
			
			for (int i = 0; i < vetorA.length; i++) {
				System.out.println(vetorA[i]);

				
			}
			

			System.out.println("pares: " + pares);
			System.out.println("impares: " + impares);

		
	
	 }

}
