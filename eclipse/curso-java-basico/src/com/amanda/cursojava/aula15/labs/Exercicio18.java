package com.amanda.cursojava.aula15.labs;

import java.util.Scanner;

// Fa�a um programa que pe�a um n�mero inteiro e determine se ele � par ou �mpar. Dica: utilize o operador m�dulo.

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um n�mero inteiro");
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O n�mero "  + numero + " � par");
		}else {
			System.out.println("O n�mero "  + numero + " � �mpar");

		}
		
		
	}

}
