package com.amanda.cursojava.aula15.labs;

import java.util.Scanner;

//Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais baato

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira valores de produtos");
		int prod1 = sc.nextInt();
		int prod2 = sc.nextInt();
		int prod3 = sc.nextInt();
		int menor;
		
		if (prod1 < prod2 && prod1 < prod3) {
			menor = prod1;
			
		} else if (prod2 < prod1 && prod2 < prod3) {
			menor = prod2;

			
		} else {
			menor = prod3;}

		System.out.println("O produto que vocverá comprar é o de valor R$ " + menor);
	}


}
