package com.amanda.cursojava.aula17.labs;

import java.util.Scanner;

/*Fa�a um programa que leia 5 n�meros e informe o maior n�mero*/

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int num;
		int maior = Integer.MIN_VALUE;
		
		System.out.println("Digite 5 n�meros");

		while(count < 5) {
			num = sc.nextInt();
			
			if (num > maior) {
				maior = num;
			}
			
			count++;
		}
		
		System.out.println("O maior n�mero �: " + maior);
	}

}
