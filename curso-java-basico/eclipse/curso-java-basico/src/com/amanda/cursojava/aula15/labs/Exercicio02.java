package com.amanda.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio02 {
	// Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número");
		int numero = sc.nextInt();
		
		if (numero >= 0) {
			System.out.println("Número positivo");
		}else {
			System.out.println("Número negativo");

		}
	}

}
