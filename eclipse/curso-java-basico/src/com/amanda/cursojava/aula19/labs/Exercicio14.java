package com.amanda.cursojava.aula19.labs;

import java.util.Scanner;

/*Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a m�dia aritm�tica
 * simples dos elementos �mpares armazenados neste vetor*/

public class Exercicio14 {
	
	 public static void main(String[] args) {
			

			Scanner sc = new Scanner(System.in);
			
			int[] vetorA = new int[10];
			int soma = 0;
			int quantidade = 0;


			
			System.out.println("Insira " + vetorA.length + " valores");
			
			for(int i = 0; i < vetorA.length; i++) {
				vetorA[i] = sc.nextInt();
				
				if(vetorA[i] % 2 == 1) {
					soma += vetorA[i];
					quantidade++;
				}
			}
			
			System.out.println("Vetor A");
			
			for (int i = 0; i < vetorA.length; i++) {
				System.out.println(vetorA[i]);

				
			}
			

			System.out.println("soma dos n�meros �mpares: " + soma);
			System.out.println("m�dia dos n�meros �mpares: " + (soma / quantidade));


		
	
	 }

}
