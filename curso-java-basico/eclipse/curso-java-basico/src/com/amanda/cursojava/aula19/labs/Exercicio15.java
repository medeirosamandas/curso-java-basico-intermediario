package com.amanda.cursojava.aula19.labs;

import java.util.Scanner;

/*Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que defina o percentual
 * de elementos pares e ímpares, respectivamente, armazenados neste vetor.*/


public class Exercicio15 {
	
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
		

		System.out.println("pares: " + pares + " que constituem " + (pares * 100 / vetorA.length) + "% dos números do vetor");
		System.out.println("ímpares: " + impares + " que constituem " + (impares *100 / vetorA.length) + "% dos números do vetor");




	}
}


