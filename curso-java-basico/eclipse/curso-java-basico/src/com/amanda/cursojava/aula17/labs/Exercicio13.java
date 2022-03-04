package com.amanda.cursojava.aula17.labs;

import java.util.Scanner;

/*Faça um programa que peça dois números, base e expoente, calcule e 
 * mostre o primeiro número elevado ao segundo número. Não utilize a 
 * função de potência da linguagem*/

public interface Exercicio13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o número para representar a base");
		int base = sc.nextInt();
		System.out.println("Insira o número para representar o expoente");
		int expoente = sc.nextInt();
		int result = base;
		
		for(int i = 1; i < expoente; i++) {
			result *= base;
		}

		System.out.println(result);
	}

}
