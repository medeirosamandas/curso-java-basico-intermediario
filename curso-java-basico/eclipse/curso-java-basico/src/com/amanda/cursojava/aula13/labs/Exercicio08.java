package com.amanda.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// Fa�a um programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. Calcule e mostre o total
		// do seu sal�rio no referido m�s
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor de quanto voc� ganha por hora e depois o n�mero de horas que voc� trabalhou!");
		double valor = sc.nextDouble();
		double horas = sc.nextDouble();
		
		System.out.println("O valor do seu sal�rio ser�: " + (valor * horas));

	}

}
