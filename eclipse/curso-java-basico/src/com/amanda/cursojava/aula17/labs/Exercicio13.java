package com.amanda.cursojava.aula17.labs;

import java.util.Scanner;

/*Fa�a um programa que pe�a dois n�meros, base e expoente, calcule e 
 * mostre o primeiro n�mero elevado ao segundo n�mero. N�o utilize a 
 * fun��o de pot�ncia da linguagem*/

public interface Exercicio13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o n�mero para representar a base");
		int base = sc.nextInt();
		System.out.println("Insira o n�mero para representar o expoente");
		int expoente = sc.nextInt();
		int result = base;
		
		for(int i = 1; i < expoente; i++) {
			result *= base;
		}

		System.out.println(result);
	}

}
