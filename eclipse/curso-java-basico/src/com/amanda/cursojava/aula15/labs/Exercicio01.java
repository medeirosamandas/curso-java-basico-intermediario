package com.amanda.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio01 {
	// Fa�a um programa que pe�a dois n�meros e imprima o maior deles

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira dois n�meros");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("O primeiro n�mero indicado � maior que o segundo");
			System.out.println(num1 + " > " + num2);
		}
		else {
			System.out.println("O segundo n�mero indicado � maior que o primeiro");
			System.out.println(num2 + " > " + num1);
			
		}

		

	}

}
