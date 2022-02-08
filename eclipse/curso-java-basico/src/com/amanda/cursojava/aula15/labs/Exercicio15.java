package com.amanda.cursojava.aula15.labs;

import java.util.Scanner;

// Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo.
// Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
//Dicas:
//- Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro; 
//- Triângulo Equilátero: três lados iguais;
//- Triângulo Isósceles: quaisquer dois lados iguais
//- TriÂngulo Escaleno: três lados diferentes
public class Exercicio15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira os 3 lados do triângulo");
		double lado1 = sc.nextDouble();
		double lado2 = sc.nextDouble();
		double lado3 = sc.nextDouble();
		
		if (lado1 + lado2 > lado3 || lado1 + lado3 > lado2 || lado2 + lado3 > lado1) {
			System.out.println("É um triângulo");
			
			if(lado1 == lado2 && lado1 == lado3) {
				System.out.println("Triângulo Equilátero (três lados iguais)");
			} else if (lado1 == lado2 && lado1 != lado3 || lado1 == lado3 && lado1 != lado2 || lado2 == lado3 && lado2 != lado1) {
				System.out.println("Triângulo Isóceles (dois lados iguais)");
				
			}else {
				System.out.println("Triângulo Escaleno, três lados diferentes");
			}
			
			
		}else {
			System.out.println("Não é um triângulo");
		}

		
	}

}
