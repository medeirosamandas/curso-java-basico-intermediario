package com.amanda.cursojava.aula15.labs;

import java.util.Scanner;

// Fa�a um Programa que pe�a os 3 lados de um tri�ngulo. O programa dever� informar se os valores podem ser um tri�ngulo.
// Indique, caso os lados formem um tri�ngulo, se o mesmo �: equil�tero, is�sceles ou escaleno.
//Dicas:
//- Tr�s lados formam um tri�ngulo quando a soma de quaisquer dois lados for maior que o terceiro; 
//- Tri�ngulo Equil�tero: tr�s lados iguais;
//- Tri�ngulo Is�sceles: quaisquer dois lados iguais
//- Tri�ngulo Escaleno: tr�s lados diferentes
public class Exercicio15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira os 3 lados do tri�ngulo");
		double lado1 = sc.nextDouble();
		double lado2 = sc.nextDouble();
		double lado3 = sc.nextDouble();
		
		if (lado1 + lado2 > lado3 || lado1 + lado3 > lado2 || lado2 + lado3 > lado1) {
			System.out.println("� um tri�ngulo");
			
			if(lado1 == lado2 && lado1 == lado3) {
				System.out.println("Tri�ngulo Equil�tero (tr�s lados iguais)");
			} else if (lado1 == lado2 && lado1 != lado3 || lado1 == lado3 && lado1 != lado2 || lado2 == lado3 && lado2 != lado1) {
				System.out.println("Tri�ngulo Is�celes (dois lados iguais)");
				
			}else {
				System.out.println("Tri�ngulo Escaleno, tr�s lados diferentes");
			}
			
			
		}else {
			System.out.println("N�o � um tri�ngulo");
		}

		
	}

}
