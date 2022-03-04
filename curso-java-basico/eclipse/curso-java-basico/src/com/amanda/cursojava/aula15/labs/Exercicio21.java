package com.amanda.cursojava.aula15.labs;

import java.util.Scanner;

// Um posto está vendendo combustíveis com a seguinte tabela de descontos:
// Álcool
// a. até 20 litros, desconto de 3% por litro
// b. acima de 20 litros, desconto de 5% por litro
// Gasolina
// c. até 20 litros, desconto de 4% por litro.
// d. acima de 20 litros, desconto de 6% por itro.
// Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina)
// Calcule e imprima o valor a ser pago pelo cliente, sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90

public class Exercicio21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o tipo de combustível que você vai abastecer");
		System.out.println("A para Álcool, G para Gasolina");
		String combustivel = sc.next();
		System.out.println("Insira quantos litros você vai abastecer.");
		double litros = sc.nextDouble();
		
		double precoGasolina = 2.5;
		double precoAlcool = 1.9;
		double desconto;
		
		if (combustivel.equals("A")){
			if(litros <= 20) {
				desconto = 0.03;
			} else {
				desconto = 0.05;
			}
			System.out.println(desconto);
			System.out.println("Álcool, " + litros + " litros, " + (precoAlcool * litros - (precoAlcool * litros * desconto)) + " reais.");
		}
		else {
			if(litros <= 20) {
				desconto = 0.04;
			} else {
				desconto = 0.06;
			}
			System.out.println("Álcool, " + litros + " litros, " + (precoGasolina * litros - (precoGasolina * litros * desconto)) + " reais.");

		}
		
		
	}

}
