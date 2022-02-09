package com.amanda.cursojava.aula17.labs;

import java.util.Scanner;

/*Faça um programa que leia 5 números e informe o maior número*/

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int num;
		int maior = Integer.MIN_VALUE;
		
		System.out.println("Digite 5 números");

		while(count < 5) {
			num = sc.nextInt();
			
			if (num > maior) {
				maior = num;
			}
			
			count++;
		}
		
		System.out.println("O maior número é: " + maior);
	}

}
