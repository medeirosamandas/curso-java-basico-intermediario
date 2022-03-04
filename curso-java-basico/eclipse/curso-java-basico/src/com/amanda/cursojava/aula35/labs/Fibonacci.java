package com.amanda.cursojava.aula35.labs;

public class Fibonacci {
	
	public static int fibonacci(int numero) {
		if (numero < 2) {
			return 1;
		}
		return fibonacci(numero - 1) + fibonacci(numero - 2);
	}

}
