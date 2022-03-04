package com.amanda.cursojava.aula19.labs;

import java.util.Scanner;

/*Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, 
 * sendo que cada elemento do vetor B deverá ser o quadrado do respectivo elemento de A, ou seja:
 * B[i] = A[i] * A[i]*/

public class Exercicio03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];

		
		System.out.println("Insira " + vetorA.length + " valores");
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
			
			vetorB[i] = vetorA[i] * vetorA[i];
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
