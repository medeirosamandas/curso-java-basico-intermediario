package com.amanda.cursojava.aula17.labs;

import java.util.Scanner;

/*Fa�a um programa que leia 5 n�meros e informe a soma e a m�dia dos n�meros*/

public class Exercicio08 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int num;
		int soma = 0;
		
		System.out.println("Digite 5 n�meros");

		while(count < 5) {
			num = sc.nextInt();
			soma += num;
			count++;
		}
		
		System.out.println("A soma dos n�meros �: " + soma);
		System.out.println("A m�dia dos n�meros �: " + (soma / 5));

	}

}
