package com.amanda.cursojava.aula19.labs;

import java.util.Scanner;

/*Criar um vetor A com 10 elementos inteiros. Escrever um programa que calcule e escreva: 
 * a) a soma de elementos armazenados neste vetor que são inferiores a 15;
 * b) a quantidade de elementos armazenados no vetor que são iguais a 15;
 * c) a média dos elementos armazenados no vetor que são superiores a 15.*/


public class Exercicio16 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int pares = 0;
		int inferiores = 0;
		int iguais = 0;
		int superiores = 0;


		
		System.out.println("Insira " + vetorA.length + " valores");
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
			if (vetorA[i] < 15) {
				inferiores++;
			}else if(vetorA[i] == 15){
				iguais++;
			}else {
				superiores++;
			}
			
		}
		
		System.out.println("Vetor A");
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i]);

			
		}
		

		System.out.println("inferiores a 15: " + inferiores);
		System.out.println("iguais a 15: " + iguais);
		System.out.println("superiores a 15: " + superiores);




	}
}
