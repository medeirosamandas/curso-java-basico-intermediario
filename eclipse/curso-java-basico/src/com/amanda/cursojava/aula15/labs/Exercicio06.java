package com.amanda.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio06 {
	// Fa�a um programa que leia tr�s n�meros e mostre o maior deles

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira tr�s n�meros");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("O maior n�mero � o n�mero 1: " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O maior n�mero � o n�mero 2: " + num2);
		} else {
			System.out.println("O maior n�mero � o n�mero 3: " + num3);
		}

		
	}

}
