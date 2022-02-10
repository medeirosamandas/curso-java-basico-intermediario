package com.amanda.cursojava.aula19.labs;

import java.util.Scanner;

/* Implementar um programa que obtenha a cotação do dólar (U$) em relação ao real (R$) e a seguir
 * armazene em um vetor A com 20 elementos as seguintes conversões:
 * A[i] = cotação do dólar * i para todo i variando de 1 até 20*/

public class Exercicio20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a cotação do dólar: ");
		
		double dolar = sc.nextDouble();
		double[] vetor = new double[20];
		
		System.out.println("Cotação do dólar variando de 1 a 20");
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = dolar * (i + 1);
			System.out.println(vetor[i]);
			
		}
	}

}
