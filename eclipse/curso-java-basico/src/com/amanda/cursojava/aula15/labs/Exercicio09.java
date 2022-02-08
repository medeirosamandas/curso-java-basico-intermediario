package com.amanda.cursojava.aula15.labs;
// Faça um programa que leia três números e mostre-os em ordem decrescente

import java.util.Scanner;

public class Exercicio09 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira três números");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int maior;
		int menor;
		int meio;
		
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
		
		if (num1 == maior && num3 == menor || num1 == menor && num3 == maior) {
			meio = num2;
		}
		else if(num1 == maior && num2 == menor || num1 == menor && num2 == maior) {
			meio = num3;
		}
		else {
			meio = num1;
		}
		
		System.out.println("maior " + maior);
		System.out.println("menor " + menor);
		System.out.println("meio " + meio);
	}

}
