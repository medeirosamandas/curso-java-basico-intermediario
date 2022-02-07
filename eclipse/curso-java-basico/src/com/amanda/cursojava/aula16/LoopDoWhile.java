package com.amanda.cursojava.aula16;

public class LoopDoWhile {

	public static void main(String[] args) {
		
		int i = 1; // count
		int max = 10;
		System.out.println("Contando até " + max);
		
		// primeiro executa o código e depois vê a condição
		// faz com que sempre seja executado uma vez a mais do que o loop while comum, se colocada a mesma condição
		
		do {
			i++;
			System.out.println("Valor de i: " + i);
		} while (i < 15);
		System.out.println(i);

	}

}
