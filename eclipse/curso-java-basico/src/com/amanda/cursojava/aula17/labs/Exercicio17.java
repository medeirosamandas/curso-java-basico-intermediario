package com.amanda.cursojava.aula17.labs;

import java.util.Scanner;

/*Fa�a um programa que calcule o fatorial de um n�mero inteiro fornecido pelo usu�rio. 
 * Ex.: 5! = 5x4x3x2x1 = 120*/

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o n�mero para descobrir o seu fatorial");
		int fatorial = sc.nextInt();
		int result = 1;
		
		for(int i = fatorial; i > 0; i--) {
			result *= i;
		}
		
		System.out.println("Fatorial de " + fatorial + " �: " + result);
		
	}

}
