package com.amanda.cursojava.aula17.labs;

import java.util.Scanner;

/*Fa�a um programa que pe�a 10 n�meros inteiros, calcule e mostre 
 * a quantidade de n�meros pares e a quantidade de n�meros �mpares*/

public class Exercicio14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 10 n�meros");
		
		int numero, pares = 0, impares = 0;
		
		for(int i = 0; i < 10; i++) {
			numero = sc.nextInt();
			if(numero % 2 == 0) {
				pares++;
			}else {
				impares++;
			}
		}System.out.println("Quantidade de n�meros pares: " + pares);
		System.out.println("Quantidade de n�meros �mpares: " + impares);
	}

}
