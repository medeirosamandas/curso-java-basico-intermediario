package com.amanda.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// Faça um programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor do lado do quadrado");
		double lado = sc.nextDouble();
		double area = lado * lado;
		
		System.out.println("O valor da área do quadrado é: " + area);
		System.out.println("O dobro disso é: " + (area * 2));

	}

}
