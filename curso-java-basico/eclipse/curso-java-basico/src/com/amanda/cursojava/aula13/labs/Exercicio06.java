package com.amanda.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		// Fa�a um programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio de um c�rculo");
		double raio = sc.nextDouble();
		double PI = 3.1415;
		double area = (raio * raio) * PI;
		
		System.out.println("O valor da �rea deste c�rculo �: " + area);
		
	}

}
