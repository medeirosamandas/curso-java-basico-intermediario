package com.amanda.cursojava.aula19.labs;

import java.util.Scanner;
import java.text.DecimalFormat;


/*Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, 
 * sendo que cada elemento do vetor B deverá ser a raíz quadrada do respectivo elemento de A, ou seja:
 * B[i] = sqrt(A[i])*/

public class Exercicio04 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		double[] vetorB = new double[vetorA.length];

		
		System.out.println("Insira " + vetorA.length + " valores");
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
			
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		
		System.out.println("Vetor A");
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i]);
		}
		
        DecimalFormat df = new DecimalFormat("###,###.##");

		System.out.println("\n Vetor B");
		
		for (int i = 0; i < vetorA.length; i++) {
            System.out.println(df.format(vetorB[i]));
            System.out.println(vetorB[i]);
		}
		
	}

}
