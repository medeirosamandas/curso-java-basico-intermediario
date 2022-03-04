package com.amanda.cursojava.aula19.labs;

import java.util.Scanner;

/* Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas. Escreva um programa que determine e escreva a quantidade
 * de pessoas que possuem idade superior a 35*/


public class Exercicio17 {
	
	 public static void main(String[] args) {
			

			Scanner sc = new Scanner(System.in);
			
			int[] vetorA = new int[10];
			int quantidade = 0;


			
			System.out.println("Insira " + vetorA.length + " idades");
			
			for(int i = 0; i < vetorA.length; i++) {
				vetorA[i] = sc.nextInt();
				
				if(vetorA[i] > 35) {
					quantidade++;
				}
			}
			
			System.out.println("Vetor A");
			
			for (int i = 0; i < vetorA.length; i++) {
				System.out.println(vetorA[i]);

				
			}
			

			System.out.println("total de pessoas que possuem mais de 35 anos: " + quantidade);


		
	
	 }


}
