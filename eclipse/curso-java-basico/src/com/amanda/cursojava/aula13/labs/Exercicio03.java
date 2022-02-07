package com.amanda.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// Faça um programa que peça um número e imprima a soma
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um número: ");
		int primeiroNumero = sc.nextInt();
		System.out.println("Insira mais um número");
		int segundoNumero = sc.nextInt();
		System.out.println("A soma dos dois números é: " + (primeiroNumero + segundoNumero));
	}

}
