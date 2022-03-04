package com.amanda.cursojava.aula17.labs;

import java.util.Scanner;

/*Faça um programa que peça 10 números inteiros, calcule e mostre 
 * a quantidade de números pares e a quantidade de números ímpares*/

public class Exercicio14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 10 números");
		
		int numero, pares = 0, impares = 0;
		
		for(int i = 0; i < 10; i++) {
			numero = sc.nextInt();
			if(numero % 2 == 0) {
				pares++;
			}else {
				impares++;
			}
		}System.out.println("Quantidade de números pares: " + pares);
		System.out.println("Quantidade de números ímpares: " + impares);
	}

}
