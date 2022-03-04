package com.amanda.cursojava.aula19.labs;

import java.util.Scanner;

/* Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas. Escreva um programa
 * que determine e escreva a menor e a maior idades e suas respectivas posições*/


public class Exercicio18 {
	 public static void main(String[] args) {
			

			Scanner sc = new Scanner(System.in);
			
			int[] vetorA = new int[10];
			int menor = 0;
			int maior = 0;
			int posicaoMenor = 0;
			int posicaoMaior = 0;


			
			System.out.println("Insira " + vetorA.length + " idades");
			
			for(int i = 0; i < vetorA.length; i++) {
				vetorA[i] = sc.nextInt();
				
				if(i == 0) {
					menor = vetorA[i];
					maior = vetorA[i];
				}else {
					if(vetorA[i] > maior) {
						maior = vetorA[i];
						posicaoMaior = i;
					}
					if(vetorA[i] < menor) {
						menor = vetorA[i];
						posicaoMenor = i;
					}
				}
			}
			
			System.out.println("Vetor A");
			
			for (int i = 0; i < vetorA.length; i++) {
				System.out.println(vetorA[i]);

				
			}
			
			System.out.println("Maior: " + maior);
			System.out.println("Posição maior: " + posicaoMaior);
			System.out.println("Menor: " + menor);
			System.out.println("Posição menor: " + posicaoMenor);
		
	
	 }
}
