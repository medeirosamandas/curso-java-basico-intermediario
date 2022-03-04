package com.amanda.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// Faça um programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius
		// C = (5 * (F-32) / 9)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a temperatura em graus Farenheit");
		double temp = sc.nextDouble();
		
		double celsius = (5 * (temp-32) / 9);
		System.out.println("A temperatura em Celsius é: " + celsius);

	}

}
