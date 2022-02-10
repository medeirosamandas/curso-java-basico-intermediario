package com.amanda.cursojava.aula19.labs;

import java.util.Scanner;

/*Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada
 * elemento de C é a divisão dos respectivos elementos em A e B, ou seja:
 * C[i] = A[i] / float(B[i])*/

public class Exercicio09 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		double[] vetorC = new double[vetorA.length];

		
		System.out.println("Insira " + vetorA.length + " valores");
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
					}
		
		System.out.println("Insira mais " + vetorA.length + " valores");
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorB[i] = sc.nextInt();
			vetorC[i] = (vetorA[i]) / (vetorB[i]);

			
		}
		
		System.out.println("Vetor A");
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i]);
		}
		
		System.out.println("\n Vetor B");
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorB[i]);
		}
		
		System.out.println("\n Vetor C");
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorC[i]);
		}
		
	}

}
