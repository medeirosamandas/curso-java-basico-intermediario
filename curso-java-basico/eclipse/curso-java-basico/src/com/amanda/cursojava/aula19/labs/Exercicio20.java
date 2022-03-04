package com.amanda.cursojava.aula19.labs;

import java.util.Scanner;

/* Implementar um programa que obtenha a cota��o do d�lar (U$) em rela��o ao real (R$) e a seguir
 * armazene em um vetor A com 20 elementos as seguintes convers�es:
 * A[i] = cota��o do d�lar * i para todo i variando de 1 at� 20*/

public class Exercicio20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a cota��o do d�lar: ");
		
		double dolar = sc.nextDouble();
		double[] vetor = new double[20];
		
		System.out.println("Cota��o do d�lar variando de 1 a 20");
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = dolar * (i + 1);
			System.out.println(vetor[i]);
			
		}
	}

}
