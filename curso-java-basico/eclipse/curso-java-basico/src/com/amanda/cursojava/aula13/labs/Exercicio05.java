package com.amanda.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		// Fa�a um programa que converta metros em cent�metros.
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor em metros");
		double metros = sc.nextDouble();
		double centimetros = metros * 100;
		
		System.out.println("O valor digitado em cent�metros �: " + centimetros);
		
		
	}

}
