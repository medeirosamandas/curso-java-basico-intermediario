package com.amanda.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// Faça um programa que peça a temperatura em graus Celsius, transforme e mostre a temperatura em graus Fahrenheit
		// F = (C * 9 / 5 +32)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a temperatura em graus Celsius");
		double temp = sc.nextDouble();
		
		double fahrenheit = ((temp * 9 / 5) +32);
		System.out.println("A temperatura em Celsius é: " + fahrenheit);

	}

}
