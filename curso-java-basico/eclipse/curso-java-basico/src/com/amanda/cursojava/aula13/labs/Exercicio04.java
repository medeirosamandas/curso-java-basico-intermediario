package com.amanda.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// Faça um programa que peça 4 notas bimestrais e mostre a média
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira as 4 notas bimestrais!");
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		double nota4 = sc.nextDouble();
		
		System.out.println("A média das notas é: " + ((nota1 + nota2 + nota3 + nota4) / 4));
	}

}
