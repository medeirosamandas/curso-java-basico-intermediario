package com.amanda.cursojava.aula19.labs;

import java.util.Scanner;

/*Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo e
 * tamanho e com os "mesmos" elementos do vetor A, ou seja, B[i] = A[i]*/

public class Exercicio01 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[5];

		
		System.out.println("Insira 5 valores");
		
		for(int i = 0; i < 5; i++) {
			vetorA[i] = sc.nextInt();
			
			vetorB[i] = vetorA[i];
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
