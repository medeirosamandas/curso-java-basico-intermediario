package com.amanda.cursojava.aula15.labs;
// F�a um programa que pe�a um n�mero correspondente a um determinado ano e em seguida informe se este ano � ou n�o bissexto

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um ano");
		int ano = sc.nextInt();
		
		if(ano % 4 == 0) {
			System.out.println("Ano bissexto");
		}
		else {
			System.out.println("Ano n�o bissexto");
		}
	}

}
