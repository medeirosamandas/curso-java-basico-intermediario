package com.amanda.cursojava.aula16;

public class LoopDoWhile {

	public static void main(String[] args) {
		
		int i = 1; // count
		int max = 10;
		System.out.println("Contando at� " + max);
		
		// primeiro executa o c�digo e depois v� a condi��o
		// faz com que sempre seja executado uma vez a mais do que o loop while comum, se colocada a mesma condi��o
		
		do {
			i++;
			System.out.println("Valor de i: " + i);
		} while (i < 15);
		System.out.println(i);

	}

}
