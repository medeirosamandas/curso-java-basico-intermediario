package com.amanda.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// Tendo como dados de entrada a altura de uma pessoa, construa um algor�tmo que calcule seu peso ideal, usando
		// a seguinte f�rmula:  (72.7*altura) - 58
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira sua altura");
		double altura = sc.nextDouble();
		
		System.out.println("Seu peso ideal �: " + ((72.7*altura) - 58));

	}

}
