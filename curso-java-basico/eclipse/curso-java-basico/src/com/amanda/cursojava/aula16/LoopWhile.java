package com.amanda.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		
		int i = 1; // count
		int max = 10;
		System.out.println("Contando at� " + max);
		
		// primeiro verifica a condi��o, depois executa o c�digo
		while(i < max) {
			System.out.println("Valor de i: " + i);
			i++;
		}
	}

}
