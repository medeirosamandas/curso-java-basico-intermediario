package com.amanda.cursojava.aula15.labs;

import java.util.Scanner;

// Fa�a um programa que leia tr�s n�meros e mostre o maior e o menor deles
public class Exercicio07 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira tr�s n�meros");
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
		
		System.out.println("O maior n�mero �: " + maior);
		System.out.println("O menor n�mero �: " + menor);

		
		
	}
	

}
