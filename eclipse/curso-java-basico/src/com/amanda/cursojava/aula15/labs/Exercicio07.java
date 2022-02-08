package com.amanda.cursojava.aula15.labs;

import java.util.Scanner;

// Faça um programa que leia três números e mostre o maior e o menor deles
public class Exercicio07 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira três números");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int maior;
		int menor;
		
		if (num1 > num2 && num1 > num3) {
			maior = num1;
			
		} else if (num2 > num1 && num2 > num3) {
			maior = num2;

			
		} else {
			maior = num3;

		}
		
		if (num1 < num2 && num1 < num3) {
			menor = num1;
			
		} else if (num2 < num1 && num2 < num3) {
			menor = num2;

			
		} else {
			menor = num3;

		}
		
		System.out.println("O maior número é: " + maior);
		System.out.println("O menor número é: " + menor);

		
		
	}
	

}
