package com.amanda.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		
		int i = 1; // count
		int max = 10;
		System.out.println("Contando até " + max);
		
		// primeiro verifica a condição, depois executa o código
		while(i < max) {
			System.out.println("Valor de i: " + i);
			i++;
		}
	}

}
