package com.amanda.cursojava.aula19.labs;

import java.util.Scanner;

/*Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com elementos do vetor A
 * multiplicados por 2, ou seja: B[i] = A[i] * 2*/

public class Exercicio02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];

		
		System.out.println("Insira " + vetorA.length + " valores");
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
			
			vetorB[i] = vetorA[i] * 2;
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
