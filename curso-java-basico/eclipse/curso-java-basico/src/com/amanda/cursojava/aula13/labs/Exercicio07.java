package com.amanda.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// Fa�a um programa que calcule a �rea de um quadrado, em seguida mostre o dobro desta �rea para o usu�rio
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor do lado do quadrado");
		double lado = sc.nextDouble();
		double area = lado * lado;
		
		System.out.println("O valor da �rea do quadrado �: " + area);
		System.out.println("O dobro disso �: " + (area * 2));

	}

}
