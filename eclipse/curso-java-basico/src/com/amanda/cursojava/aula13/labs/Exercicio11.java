package com.amanda.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// Fa�a um programa que pe�a 2 n�meros inteiros e um n�mero real.
		// Calcule e mostre:
		// a. o produto do dobro do primeiro com a metade do segundo
		// b. a soma do triplo do primeiro com o terceiro
		// c. o terceiro elevado ao cubo
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira dois n�meros inteiros e um n�mero real");
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
