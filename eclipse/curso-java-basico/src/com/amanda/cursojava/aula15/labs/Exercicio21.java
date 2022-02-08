package com.amanda.cursojava.aula15.labs;

import java.util.Scanner;

// Um posto est� vendendo combust�veis com a seguinte tabela de descontos:
// �lcool
// a. at� 20 litros, desconto de 3% por litro
// b. acima de 20 litros, desconto de 5% por litro
// Gasolina
// c. at� 20 litros, desconto de 4% por litro.
// d. acima de 20 litros, desconto de 6% por itro.
// Escreva um algoritmo que leia o n�mero de litros vendidos, o tipo de combust�vel (codificado da seguinte forma: A-�lcool, G-gasolina)
// Calcule e imprima o valor a ser pago pelo cliente, sabendo-se que o pre�o do litro da gasolina � R$ 2,50 o pre�o do litro do �lcool � R$ 1,90

public class Exercicio21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o tipo de combust�vel que voc� vai abastecer");
		System.out.println("A para �lcool, G para Gasolina");
		String combustivel = sc.next();
		System.out.println("Insira quantos litros voc� vai abastecer.");
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
			System.out.println("�lcool, " + litros + " litros, " + (precoAlcool * litros - (precoAlcool * litros * desconto)) + " reais.");
		}
		else {
			if(litros <= 20) {
				desconto = 0.04;
			} else {
				desconto = 0.06;
			}
			System.out.println("�lcool, " + litros + " litros, " + (precoGasolina * litros - (precoGasolina * litros * desconto)) + " reais.");

		}
		
		
	}

}
