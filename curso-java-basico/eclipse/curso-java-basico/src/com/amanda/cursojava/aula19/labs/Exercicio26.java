package com.amanda.cursojava.aula19.labs;

import java.util.Scanner;

/* Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C de mesmo 
 * tipo e tamanho, obedecendo as seguintes regras de formação:
 * a) C[i] deverá receber 1 quando A[i] for maior que B[i]
 * b) C[i] deverá receber 0 quando A[i] for igual a B[i]
 * c) C[i] deverá receber -1 quando A[i] for menor que B[i]*/

public class Exercicio26 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];

		
		System.out.println("Insira " + vetorA.length + " valores");
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
					}
		
		System.out.println("Insira mais " + vetorA.length + " valores");
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorB[i] = sc.nextInt();
			
			if(vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
			} else if(vetorA[i] == vetorB[i]) {
				vetorC[i] = 0;

			}else {
				vetorC[i] = -1;

			}

			
		}
		
		System.out.println("Vetor A");
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println("\n Vetor B");
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println("\n Vetor C");
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		
	}


}
