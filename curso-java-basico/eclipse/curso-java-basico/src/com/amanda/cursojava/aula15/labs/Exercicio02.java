package com.amanda.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio02 {
	// Fa�a um programa que pe�a um valor e mostre na tela se o valor � positivo ou negativo

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um n�mero");
		int numero = sc.nextInt();
		
		if (numero >= 0) {
			System.out.println("N�mero positivo");
		}else {
			System.out.println("N�mero negativo");

		}
	}

}
