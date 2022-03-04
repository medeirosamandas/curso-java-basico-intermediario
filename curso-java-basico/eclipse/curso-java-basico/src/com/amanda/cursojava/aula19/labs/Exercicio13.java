package com.amanda.cursojava.aula19.labs;

import java.util.Scanner;

/*Criar um vetor A com 10 elementos inteiros. Implementar um progama que determine a soma dos elementos armazenados nesse vetor que são múltiplos de 5*/

public class Exercicio13 {
	
	 public static void main(String[] args) {
			

			Scanner sc = new Scanner(System.in);
			
			int[] vetorA = new int[10];
			int soma = 0;


			
			System.out.println("Insira " + vetorA.length + " valores");
			
			for(int i = 0; i < vetorA.length; i++) {
				vetorA[i] = sc.nextInt();
				
				if(vetorA[i] % 5 == 0) {
					soma += vetorA[i];
				}
			}
			
			System.out.println("Vetor A");
			
			for (int i = 0; i < vetorA.length; i++) {
				System.out.println(vetorA[i]);

				
			}
			

			System.out.println("soma dos números divisíveis por 5 é: " + soma);

		
	
	 }

	
	

}
