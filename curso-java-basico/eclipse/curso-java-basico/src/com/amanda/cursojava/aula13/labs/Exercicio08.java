package com.amanda.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total
		// do seu salário no referido mês
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor de quanto você ganha por hora e depois o número de horas que você trabalhou!");
		double valor = sc.nextDouble();
		double horas = sc.nextDouble();
		
		System.out.println("O valor do seu salário será: " + (valor * horas));

	}

}
