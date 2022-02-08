package com.amanda.cursojava.aula15.labs;

import java.util.Scanner;

// Faça um programa que peça um número inteiro e determine se ele é par ou ímpar. Dica: utilize o operador módulo.

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número inteiro");
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O número "  + numero + " é par");
		}else {
			System.out.println("O número "  + numero + " é ímpar");

		}
		
		
	}

}
