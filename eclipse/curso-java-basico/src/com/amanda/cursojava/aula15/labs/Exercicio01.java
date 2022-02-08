package com.amanda.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio01 {
	// Faça um programa que peça dois números e imprima o maior deles

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira dois números");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("O primeiro número indicado é maior que o segundo");
			System.out.println(num1 + " > " + num2);
		}
		else {
			System.out.println("O segundo número indicado é maior que o primeiro");
			System.out.println(num2 + " > " + num1);
			
		}

		

	}

}
