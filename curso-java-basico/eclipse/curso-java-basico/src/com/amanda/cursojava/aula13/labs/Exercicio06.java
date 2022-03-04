package com.amanda.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		// Faça um programa que peça o raio de um círculo, calcule e mostre sua área.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio de um círculo");
		double raio = sc.nextDouble();
		double PI = 3.1415;
		double area = (raio * raio) * PI;
		
		System.out.println("O valor da área deste círculo é: " + area);
		
	}

}
