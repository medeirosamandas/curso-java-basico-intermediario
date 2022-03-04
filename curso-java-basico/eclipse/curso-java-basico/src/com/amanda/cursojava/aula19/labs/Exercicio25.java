package com.amanda.cursojava.aula19.labs;

import java.util.Scanner;

/* Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo
 *  tipo e tamanho, obedecendo as seguintes regras de formação:
 * a) B[i] deverá receber 1 quando A[i] for par
 * b) B[i] deverá receber 0 quando A[i] for ímpar*/

public class Exercicio25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		System.out.println("Insira os dados do vetor 1");
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
			if(vetorA[i] % 2 == 0) {
				vetorB[i] = 1;
			} else {
				vetorB[i] = 0;
			}
		}
		
		System.out.println("Vetor A");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println("\nVetor B");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
	}
}
