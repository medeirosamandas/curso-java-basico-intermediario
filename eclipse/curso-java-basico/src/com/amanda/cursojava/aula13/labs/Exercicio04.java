package com.amanda.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// Fa�a um programa que pe�a 4 notas bimestrais e mostre a m�dia
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira as 4 notas bimestrais!");
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		double nota4 = sc.nextDouble();
		
		System.out.println("A m�dia das notas �: " + ((nota1 + nota2 + nota3 + nota4) / 4));
	}

}
