package com.amanda.cursojava.aula35.labs;

/*Escreva um m�todo recursivo e est�tico que calcule e retorne o N-�simo termo da sequ�ncia Fibonacci.
 * Alguns n�meros dessa sequ�ncia s�o: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...*/

public class Exercicio01 {
	
	public static void main(String[] args) {
		for(int i = 0; i < 20; i++) {
			System.out.print(Fibonacci.fibonacci(i) + " ");
		}
	}

}
