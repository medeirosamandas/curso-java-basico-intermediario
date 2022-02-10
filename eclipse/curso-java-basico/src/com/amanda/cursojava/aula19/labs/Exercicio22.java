package com.amanda.cursojava.aula19.labs;
/* Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a 0 e1 , sugestão: A[i] = (int)Math.round(Math.random() * 1);
 * Pede - se para implementar um programa que determine o percentual de números 0's e 1's existentes no vetor A.*/

public class Exercicio22 {
	
	public static void main(String[] args) {
		
		int[] vetorA = new int[10];
		int zero = 0;
		int one = 0;
	
		System.out.println("Vetor: ");
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int)Math.round(Math.random() * 1);
			System.out.print(vetorA[i] + " ");
			
			if(vetorA[i] == 0) {
				zero++;
			}else{
				one++;
			}
		}
			System.out.println("\n\nA quantidade de números 0 é: " + zero);
			System.out.println("Que corresponde a " + (zero * 100 / vetorA.length) + "% do vetor");
			
			System.out.println("A quantidade de números 1 é: " + one);
			System.out.println("Que corresponde a " + (one * 100 / vetorA.length) + "% do vetor");
		
	}

}
