package com.amanda.cursojava.aula35;

public class TesteFatorial {

	public static void main(String[] args) {

		int fatorialNR = Fatorial.fatorialNaoRecursivo(5);
		System.out.println(fatorialNR);

		int fatorialR = Fatorial.fatorial(5);
		System.out.println(fatorialR);
	}

}
