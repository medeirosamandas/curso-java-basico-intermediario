package com.amanda.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// Faça um programa que peça 2 números inteiros e um número real.
		// Calcule e mostre:
		// a. o produto do dobro do primeiro com a metade do segundo
		// b. a soma do triplo do primeiro com o terceiro
		// c. o terceiro elevado ao cubo
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira dois números inteiros e um número real");
		int primeiroNumero = sc.nextInt();
		int segundoNumero = sc.nextInt();
		double terceiroNumero = sc.nextDouble();
		
		double primeiro = (primeiroNumero * 2) * (segundoNumero / 2);
		double segundo = (primeiroNumero * 3) + terceiroNumero;
		double terceiro = terceiroNumero * terceiroNumero * terceiroNumero;
		
		System.out.println("a. o produto do dobro do primeiro com a metade do segundo: " + primeiro);
		System.out.println("b. a soma do triplo do primeiro com o terceiro: " + segundo);
		System.out.println("c. o terceiro elevado ao cubo: " + terceiro);

	}

}
