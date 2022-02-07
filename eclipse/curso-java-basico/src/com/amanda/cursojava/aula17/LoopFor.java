package com.amanda.cursojava.aula17;

public class LoopFor {
	public static void main(String[] args) {
		
		// for simples com incremento
		for(int i = 0; i < 5; i++) {
			System.out.println("Valor do i: " + i);
		}
		System.out.println();
		
		// for simples com decremento
		for(int i = 5; i > 0; i--) {
			System.out.println("Valor do i: " + i);
		}
		
		System.out.println();
		
		// utilizando for com duas vari�veis
		for(int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i = " + i + " j = " + j);
		}
		System.out.println();
		
		// for com partes ausentes
		
		int count = 0;
		
		for(; count < 5;) {
			System.out.println("Valor de count: " + count );
			count += 2;
		}
		
		System.out.println();
		
		// loop infinito
		
		// for(;;);
		
		// loop sem corpo (mais utilizado quando quer somar valores)
		
		int soma = 0;
		for(int i = 1; i < 5; soma += i++);
		System.out.println("O valor da soma �: " + soma);
		
	}

}
