package com.amanda.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// Fa�a um programa que pe�a um n�mero e imprima a soma
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um n�mero: ");
		int primeiroNumero = sc.nextInt();
		System.out.println("Insira mais um n�mero");
		int segundoNumero = sc.nextInt();
		System.out.println("A soma dos dois n�meros �: " + (primeiroNumero + segundoNumero));
	}

}
