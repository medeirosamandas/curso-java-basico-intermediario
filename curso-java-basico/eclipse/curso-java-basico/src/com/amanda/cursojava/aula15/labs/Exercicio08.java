package com.amanda.cursojava.aula15.labs;

import java.util.Scanner;

//Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual produto voc� deve comprar, sabendo que a decis�o � sempre pelo mais baato

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

		System.out.println("O produto que vocver� comprar � o de valor R$ " + menor);
	}


}
