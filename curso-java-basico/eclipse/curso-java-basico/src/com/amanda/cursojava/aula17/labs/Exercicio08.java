package com.amanda.cursojava.aula17.labs;

import java.util.Scanner;

/*Faça um programa que leia 5 números e informe a soma e a média dos números*/

public class Exercicio08 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int num;
		int soma = 0;
		
		System.out.println("Digite 5 números");

		while(count < 5) {
			num = sc.nextInt();
			soma += num;
			count++;
		}
		
		System.out.println("A soma dos números é: " + soma);
		System.out.println("A média dos números é: " + (soma / 5));

	}

}
